import fs from 'fs';
import path from 'path';

// The directories we want to scan
const directories = {
  java: 'java_programing',
  sql: 'sql',
  web: 'Web'
};

const outputFilePath = path.join('src', 'assets', 'fileData.json');

// Only read text-based files that are relevant
const ALLOWED_EXTENSIONS = new Set([
  '.java', '.sql', '.html', '.css', '.js', '.txt', '.md', '.json', '.xml', '.yaml', '.yml'
]);

// Skip files larger than 1MB to prevent memory issues
const MAX_FILE_SIZE = 1024 * 1024;

// Recursive function to get all files in a directory
function getAllFiles(dirPath, arrayOfFiles) {
  let files;
  try {
    files = fs.readdirSync(dirPath);
  } catch (err) {
    return arrayOfFiles || [];
  }

  arrayOfFiles = arrayOfFiles || [];

  files.forEach(function(file) {
    const fullPath = path.join(dirPath, file);
    try {
      if (fs.statSync(fullPath).isDirectory()) {
        // Skip node_modules or .git if they accidentally exist
        if (file !== 'node_modules' && file !== '.git') {
          arrayOfFiles = getAllFiles(fullPath, arrayOfFiles);
        }
      } else {
        const ext = path.extname(fullPath).toLowerCase();
        if (ALLOWED_EXTENSIONS.has(ext)) {
          const stats = fs.statSync(fullPath);
          if (stats.size <= MAX_FILE_SIZE) {
            arrayOfFiles.push(fullPath);
          }
        }
      }
    } catch (err) {
      // Ignore files we can't read
    }
  });

  return arrayOfFiles;
}

const main = () => {
  const data = {
    java: [],
    sql: [],
    web: []
  };

  // Make sure src/assets exists
  if (!fs.existsSync(path.join('src', 'assets'))) {
    fs.mkdirSync(path.join('src', 'assets'), { recursive: true });
  }

  for (const [key, folderName] of Object.entries(directories)) {
    if (fs.existsSync(folderName)) {
      const files = getAllFiles(folderName);
      
      files.forEach(filePath => {
        try {
          // Read file content
          const content = fs.readFileSync(filePath, 'utf8');
          // Get last modified time
          const stats = fs.statSync(filePath);
          
          // Normalize path separators for the UI
          const normalizedPath = filePath.replace(/\\/g, '/');
          
          data[key].push({
            id: normalizedPath,
            name: path.basename(filePath),
            folderPath: path.dirname(normalizedPath),
            fullPath: normalizedPath,
            content: content,
            mtime: stats.mtimeMs // Store time in milliseconds for sorting
          });
        } catch (err) {
          // Skip file if it fails to read
        }
      });
      
      // Sort by latest modified time descending
      data[key].sort((a, b) => b.mtime - a.mtime);
    }
  }

  try {
    // Avoid pretty printing with `null, 2` to save string size, and just stringify directly
    fs.writeFileSync(outputFilePath, JSON.stringify(data));
    console.log('Successfully generated src/assets/fileData.json with latest modified times and nested folder support.');
  } catch (err) {
    console.error('Failed to generate JSON:', err.message);
  }
};

main();
