import React, { useState } from 'react';
import JavaPrograms from './Components/java';
import SqlPrograms from './Components/sql';
import WebPrograms from './Components/web';
import './App.css';

function App() {
  const [activeTab, setActiveTab] = useState('java');

  return (
    <div className="app-container">
      <header className="app-header">
        <h1>My Coding Journey</h1>
        <p>A collection of my learning files across different technologies.</p>
        <nav className="tabs">
          <button 
            className={activeTab === 'java' ? 'active' : ''} 
            onClick={() => setActiveTab('java')}
          >
            Java
          </button>
          <button 
            className={activeTab === 'sql' ? 'active' : ''} 
            onClick={() => setActiveTab('sql')}
          >
            SQL
          </button>
          <button 
            className={activeTab === 'web' ? 'active' : ''} 
            onClick={() => setActiveTab('web')}
          >
            Web Dev
          </button>
        </nav>
      </header>
      
      <main className="app-content">
        {activeTab === 'java' && <JavaPrograms />}
        {activeTab === 'sql' && <SqlPrograms />}
        {activeTab === 'web' && <WebPrograms />}
      </main>
    </div>
  );
}

export default App;
