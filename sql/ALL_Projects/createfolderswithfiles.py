# import os

# # List of filenames to create
# sql_files = ["Que_Descrptioin.sql", "Create_Tables.sql", "Seed_data.sql"]

# # Loop through 1 to 10
# for i in range(1, 11):
#     folder_name = f"Project{i}"
    
#     # 1. Create the folder if it doesn't exist
#     os.makedirs(folder_name, exist_ok=True)
    
#     # 2. Create each .sql file inside the current folder
#     for file_name in sql_files:
#         file_path = os.path.join(folder_name, file_name)
        
#         # 'w' mode creates the file if it doesn't exist
#         with open(file_path, 'w') as f:
#             f.write(f"-- SQL file: {file_name} for {folder_name}\n")
            
#     print(f"✅ Setup complete for {folder_name}")
# print("All folders and files have been created successfully!")

import os

# Define the React files and their basic starter code
react_files = {
    "App.js": "import React from 'react';\n\nfunction App() {\n  return <div><h1>Project Root</h1></div>;\n}\n\nexport default App;",
    "index.js": "import React from 'react';\nimport ReactDOM from 'react-dom/client';\nimport App from './App';\n\nconst root = ReactDOM.createRoot(document.getElementById('root'));\nroot.render(<App />);",
    "App.css": "/* App Styles */\n.App { text-align: center; }",
    "package.json": '{\n  "name": "react-project",\n  "version": "1.0.0",\n  "dependencies": {\n    "react": "^18.0.0",\n    "react-dom": "^18.0.0"\n  }\n}'
}

# Loop to create 10 project folders
for i in range(1, 11):
    folder_name = f"Project{i}"
    src_folder = os.path.join(folder_name, "src")
    
    # 1. Create Folder Structure (Project/src)
    os.makedirs(src_folder, exist_ok=True)
    
    # 2. Create the files
    for file_name, content in react_files.items():
        # Place JS and CSS in 'src', package.json in root
        if file_name == "package.json":
            file_path = os.path.join(folder_name, file_name)
        else:
            file_path = os.path.join(src_folder, file_name)
            
        with open(file_path, 'w') as f:
            f.write(content)
            
    print(f"✅ React files created for {folder_name}")

print("\nAll 10 React structures are ready!")
