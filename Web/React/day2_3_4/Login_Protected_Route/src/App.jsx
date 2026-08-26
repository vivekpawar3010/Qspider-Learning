import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import Products from "./components/Products";
import ProtectedRoute from "./components/ProtectedRoute";
import Support from "./components/Support";
import { ErrorBoundary } from "react-error-boundary";

let App = () => {
  let router = createBrowserRouter([
    {
      path: "/",
      element: <Home />
    },
    {
      path: "/login",
      element: <Login />
    },
    {
      path: "/register",
      element: <Register />
    },
    {
      path: "/products/:id",
      element: <ProtectedRoute>
        <Products />
      </ProtectedRoute>
    },
    {
      path: "/products/support",
      element: <ErrorBoundary fallback={<div>Something went wrong. Please try again later.</div>}>
        <ProtectedRoute>
          <Support />
        </ProtectedRoute>
      </ErrorBoundary>
    }
  ])
  return (
    <RouterProvider router={router}></RouterProvider>
  )
}

export default App;