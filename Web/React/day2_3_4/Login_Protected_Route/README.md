# Login Protected Route

Run the React app with:

```bash
npm install
npm run dev
```

Start the local JSON Server in a second terminal:

```bash
npm run server
```

The app reads registered users from `http://localhost:3000/allUsers` and
products from `http://localhost:3000/products`. New registrations are saved to
`backend/db.json`.

Demo login:

- Username: `admin`
- Password: `admin123`

After login, the user session is stored in `localStorage`, the products route
is protected, and Logout clears the session and returns to the login page.

## React + Vite

This template provides a minimal setup to get React working in Vite with HMR and some Oxlint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Oxc](https://oxc.rs)
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/)

## React Compiler

The React Compiler is not enabled on this template because of its impact on dev & build performances. To add it, see [this documentation](https://react.dev/learn/react-compiler/installation).

## Expanding the Oxlint configuration

If you are developing a production application, we recommend using TypeScript with type-aware lint rules enabled. Check out the [TS template](https://github.com/vitejs/vite/tree/main/packages/create-vite/template-react-ts) for information on how to integrate TypeScript and Oxlint's TypeScript related rules in your project.
