import React, { useState } from 'react';
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { vscDarkPlus } from 'react-syntax-highlighter/dist/esm/styles/prism';
import fileData from '../assets/fileData.json';

const JavaPrograms = () => {
  const [searchTerm, setSearchTerm] = useState('');
  
  const files = fileData.java || [];
  
  const filteredFiles = files.filter(file => 
    file.name.toLowerCase().includes(searchTerm.toLowerCase()) || 
    file.content.toLowerCase().includes(searchTerm.toLowerCase()) ||
    file.folderPath.toLowerCase().includes(searchTerm.toLowerCase())
  );

  const latestFile = files.length > 0 ? files[0] : null;

  return (
    <div className="module-container">
      <h2>Java Programs</h2>
      
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
          <div className="code-card">
            <h3 className="file-name">
              {latestFile.name} <span className="folder-badge">{latestFile.folderPath}</span>
            </h3>
            <SyntaxHighlighter language="java" style={vscDarkPlus} showLineNumbers>
              {latestFile.content}
            </SyntaxHighlighter>
          </div>
          <h3 className="section-title">All Programs</h3>
        </div>
      )}

      {filteredFiles.length === 0 ? (
        <p className="empty-state">No files match your search.</p>
      ) : null}

      <div className="file-grid">
        {filteredFiles.map((file, index) => (
          (searchTerm === '' && file.id === latestFile?.id) ? null :
          <div key={index} className="code-card">
            <h3 className="file-name">
              {file.name} <span className="folder-badge">{file.folderPath}</span>
            </h3>
            <SyntaxHighlighter language="java" style={vscDarkPlus} showLineNumbers>
              {file.content}
            </SyntaxHighlighter>
          </div>
        ))}
      </div>
    </div>
  );
};

export default JavaPrograms;