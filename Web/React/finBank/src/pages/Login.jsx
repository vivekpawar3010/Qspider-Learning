import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { loginUser } from "../services/userservice";
import { storeUserSession } from "../services/session";
import styles from "./css/Login.module.css";

const Login = () => {
  let [userName, setUserName] = useState("");
  let [userPassword, setUserPassword] = useState("");
  let [loading, setLoading] = useState(false);
  let [error, setError] = useState("");

  let nav = useNavigate();

  let handleLogin = async (event) => {
    event.preventDefault();
    setError("");
    if (!userName || !userPassword) {
      setError("Enter your email and password.");
      return;
    }
    setLoading(true);
    try {
      let user = await loginUser(userName, userPassword);

      if (user) {
        storeUserSession(user);
        nav("/dashboard");
      }
    } catch {
      setError("Invalid credentials. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className={styles.loginContainer}>
      <div className={styles.loginBox}>
        <h1 className={styles.title}>Login</h1>

        <form className={styles.form} onSubmit={handleLogin}>
          <input
            className={styles.input}
            type="text"
            placeholder="Enter Mail"
            autoComplete="email"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
          />

          <input
            className={styles.input}
            type="password"
            placeholder="Enter Password"
            autoComplete="current-password"
            value={userPassword}
            onChange={(e) => setUserPassword(e.target.value)}
          />

          <button
            className={styles.loginButton}
            type="submit"
            disabled={loading}
          >
            {loading ? "Signing in..." : "Login"}
          </button>
          {error && <p role="alert">{error}</p>}
        </form>

        <div
          style={{
            display: "flex",
            justifyContent: "space-between",
            gap: "12px",
            marginTop: "12px",
            flexWrap: "wrap",
          }}
        >
          <Link to="/register" className={styles.registerLink}>
            Register
          </Link>
          <Link to="/admin" className={styles.registerLink}>
            Admin Login
          </Link>
        </div>
      </div>
    </div>
  );
};

export default Login;
