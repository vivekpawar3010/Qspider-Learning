import "./App.css";
import Header from "./components/Header";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import DashBoard from "./pages/DashBoard";
import Transactions from "./pages/Transactions";
import DoTransaction from "./pages/DoTransaction";
import Transfer from "./pages/Transfer";
import About from "./pages/About";
import Contact from "./pages/Contact";
import AdminLogin from "./pages/AdminLogin";
import AdminDashboard from "./pages/AdminDashboard";
import { Navigate } from "react-router-dom";

const ProtectedRoute = ({ children }) => {
  const user = localStorage.getItem("user");
  return user ? children : <Navigate to="/" replace />;
};

const AdminRoute = ({ children }) => {
  return localStorage.getItem("isAdmin") === "true" &&
    localStorage.getItem("admin") ? (
    children
  ) : (
    <Navigate to="/admin" replace />
  );
};

function App() {
  let router = createBrowserRouter([
    {
      path: "/",
      element: <Header></Header>,
      children: [
        {
          path: "/",
          element: <Login></Login>,
        },
        {
          path: "/register",
          element: <Register></Register>,
        },
        {
          path: "/dashboard",
          element: (
            <ProtectedRoute>
              <DashBoard />
            </ProtectedRoute>
          ),
        },
        {
          path: "/transactions",
          element: (
            <ProtectedRoute>
              <Transactions />
            </ProtectedRoute>
          ),
        },
        {
          path: "/doTransaction",
          element: (
            <ProtectedRoute>
              <DoTransaction />
            </ProtectedRoute>
          ),
        },
        {
          path: "/moneyTransfer",
          element: (
            <ProtectedRoute>
              <Transfer />
            </ProtectedRoute>
          ),
        },
        {
          path: "/about",
          element: <About></About>,
        },
        {
          path: "/contact",
          element: <Contact></Contact>,
        },
      ],
    },
    {
      path: "/admin",
      element: <AdminLogin></AdminLogin>,
    },
    {
      path: "/admin-dashboard",
      element: (
        <AdminRoute>
          <AdminDashboard />
        </AdminRoute>
      ),
    },
  ]);

  return (
    <>
      <RouterProvider router={router}></RouterProvider>
    </>
  );
}

export default App;
