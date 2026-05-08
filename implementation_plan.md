# Displaying Local Learning Files using Vite

This plan outlines the steps to implement the Vite Glob Import approach to dynamically read and display your local `.java`, `.sql`, and `.html` files in your React app.

## User Review Required

> [!IMPORTANT]
> Please review the proposed folder structure and let me know if it works for you. 
> I will also install `react-syntax-highlighter` to make the code look beautiful like it does in an IDE.

## Proposed Changes

### 1. Folder Structure & Sample Files
We will create a structured place to store your learning files inside the `src/assets` folder. I will create these folders and add one small dummy file to each so we can verify it works.

#### [NEW] `src/assets/java_programs/HelloWorld.java`
#### [NEW] `src/assets/sql/sample.sql`
#### [NEW] `src/assets/Web/sample.html`

---

### 2. Dependencies
I will run the following command to install syntax highlighting so your code is colorful and easy to read:
```bash
npm install react-syntax-highlighter
```

---

### 3. Components

#### [MODIFY] `src/Components/java.jsx`
- We will use `import.meta.glob('../assets/java_programs/*.*', { query: '?raw', import: 'default' })` to fetch all files in the java folder.
- We will loop through the files and display them using the syntax highlighter.

#### [MODIFY] `src/Components/sql.jsx`
- Same logic as Java, but targeting `../assets/sql/*.*`.

#### [MODIFY] `src/Components/web.jsx`
- We will target `../assets/Web/*.*`.
- **Special Feature:** We will split the view. On the left side (or top), we will show the HTML code. On the right side (or bottom), we will use an `<iframe srcDoc={code}></iframe>` to actually **render the webpage output** so you can see what the HTML code produces.

#### [MODIFY] `src/App.jsx`
- I will update `App.jsx` to include simple navigation tabs (e.g., "Java", "SQL", "Web") so you can easily switch between your different learning subjects.

## Verification Plan

### Automated Tests
- I will start the Vite dev server (`npm run dev`) and visually verify using the browser tool that:
  1. The Java and SQL code is loaded and highlighted.
  2. The Web component correctly displays both the code AND the rendered output.
