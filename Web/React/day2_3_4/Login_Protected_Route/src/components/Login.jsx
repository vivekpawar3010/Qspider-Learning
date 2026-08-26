import { Link, useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import axios from "axios";
import "./Auth.css";

const demoUser = {
    id: "demo",
    userName: "admin",
    password: "admin123"
};

let Login = () => {
    let nav = useNavigate();

    let [name, setName] = useState("");
    let [password, setPassword] = useState("");

    let [allUsers, setAllUsers] = useState([]);
    let [error, setError] = useState("");

    useEffect(() => {
        axios.get("http://localhost:3000/allUsers").then((res) => {
            setAllUsers(res.data);
        }).catch(() => {
            setAllUsers([demoUser]);
        });
    }, []);

    let handleLogin = (event) => {
        event.preventDefault();
        setError("");

        let user = allUsers.find((ele) => {
            return ele.userName === name.trim() && ele.password === password;
        });

        if (!user && name.trim() === demoUser.userName && password === demoUser.password) {
            user = demoUser;
        }

        if (user) {
            localStorage.setItem("token", String(user.id));
            localStorage.setItem("currentUser", JSON.stringify(user));
            nav(`/products/${user.id}`);
        } else {
            setError("Invalid username or password.");
        }
    }

    return (
        <div className="login-page">
            <form className="auth-card" onSubmit={handleLogin}>
                <h2>Login</h2>

                <label htmlFor="username">USER NAME</label>
                <input id="username" type="text" value={name} onChange={(e) => {
                    setName(e.target.value);
                }} />

                <label htmlFor="password">PASSWORD</label>
                <input id="password" type="password" value={password} onChange={(e) => {
                    setPassword(e.target.value);
                }} />

                {error && <p className="form-error" role="alert">{error}</p>}
                <button className="btn-primary" type="submit">Login</button>
                <button className="btn-secondary" type="button"><Link to={"/register"}>Register</Link></button>
                <p className="demo-credentials">Demo: admin / admin123</p>
            </form>
        </div>
    )
}

export default Login;