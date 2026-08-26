import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Auth.css";

let Register = () => {
    let nav = useNavigate();

    let [name, setName] = useState();
    let [password, setPassword] = useState();

    let handleSubmit = () => {
        let user = {
            userName: name,
            password: password
        }

        axios.post("http://localhost:3000/allUsers", user).then(() => {
            console.log("registered");
            nav("/login");
        }).catch((err) => {
            console.log(err);
        })
    }

    return (
        <div className="register-page">
            <div className="auth-card">
                <h2>Register</h2>

                <label htmlFor="">USER NAME</label>
                <input
                    type="text"
                    placeholder="Enter username"
                    onChange={(e) => {
                        e.preventDefault();
                        setName(e.target.value);
                    }}
                />

                <label htmlFor="">PASSWORD</label>
                <input
                    type="text"
                    placeholder="Enter password"
                    onChange={(e) => {
                        e.preventDefault();
                        setPassword(e.target.value);
                    }}
                />

                <button className="btn-primary" onClick={handleSubmit}>
                    Register
                </button>
            </div>
        </div>
    )
}

export default Register;