import React, { useState } from 'react';
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { vscDarkPlus } from 'react-syntax-highlighter/dist/esm/styles/prism';
import fileData from '../assets/fileData.json';

const WebPrograms = () => {
  const [searchTerm, setSearchTerm] = useState('');
  
  const files = fileData.web || [];
  
  const filteredFiles = files.filter(file => 
    file.name.toLowerCase().includes(searchTerm.toLowerCase()) || 
    file.content.toLowerCase().includes(searchTerm.toLowerCase()) ||
    file.folderPath.toLowerCase().includes(searchTerm.toLowerCase())
  );

  const latestFile = files.length > 0 ? files[0] : null;

  return (
    <div className="module-container">
      <h2>Web Development Projects</h2>
      
      <div className="search-bar">
        <input 
          type="text" 
          placeholder="Search by file name, folder, or code content..." 
          value={searchTerm}
          onChange={(e) => setSearchTerm(e.target.value)}
        />
      </div>

      {searchTerm === '' && latestFile && (
        <div className="latest-section">
          <h3 className="section-title">⭐ Latest Update</h3>
          {renderWebCard(latestFile)}
          <h3 className="section-title">All Projects</h3>
        </div>
      )}

      {filteredFiles.length === 0 ? (
        <p className="empty-state">No files match your search.</p>
      ) : null}

      <div className="file-grid">
        {filteredFiles.map((file, index) => (
          (searchTerm === '' && file.id === latestFile?.id) ? null :
          <React.Fragment key={index}>
            {renderWebCard(file)}
          </React.Fragment>
        ))}
      </div>
    </div>
  );

  function renderWebCard(file) {
    const isHtml = file.name.endsWith('.html');
    let language = 'javascript';
    if (isHtml) language = 'html';
    if (file.name.endsWith('.css')) language = 'css';
    
    return (
      <div className="web-card">
        <h3 className="file-name">
          {file.name} <span className="folder-badge">{file.folderPath}</span>
        </h3>
        <div className={isHtml ? "split-view" : "single-view"}>
          <div className="code-section">
            <SyntaxHighlighter language={language} style={vscDarkPlus} showLineNumbers>
              {file.content}
            </SyntaxHighlighter>
          </div>
          {isHtml && (
            <div className="output-section">
              <div className="output-header">Live Preview</div>
              <iframe 
                title={file.name} 
                srcDoc={file.content} 
                className="preview-iframe"
                sandbox="allow-scripts allow-modals"
              />
            </div>
          )}
        </div>
      </div>
    );
  }
};

export default WebPrograms;