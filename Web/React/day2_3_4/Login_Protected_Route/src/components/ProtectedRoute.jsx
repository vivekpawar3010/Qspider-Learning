import { Navigate } from 'react-router-dom';

const ProtectedRoute = ({ children }) => {
    let token = localStorage.getItem("token");
    let currentUser = localStorage.getItem("currentUser");

    if (!token || !currentUser) {
        return <Navigate to="/login" replace />;
    }

    return children;
}

export default ProtectedRoute

