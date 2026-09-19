import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { loginAdmin } from "../services/userservice";
import styles from "./css/AdminLogin.module.css";

const AdminLogin = () => {
  let [adminEmail, setAdminEmail] = useState("");
  let [adminPassword, setAdminPassword] = useState("");
  let [loading, setLoading] = useState(false);

  let nav = useNavigate();

  let handleLogin = async () => {
    if (!adminEmail || !adminPassword) {
      alert("Please fill all fields");
      return;
    }

    setLoading(true);
    try {
      let user = await loginAdmin(adminEmail, adminPassword);

      if (user) {
        console.log("Admin logged in:", user);
        localStorage.setItem("admin", JSON.stringify(user));
        localStorage.setItem("isAdmin", "true");
        nav("/admin-dashboard");
      }
    } catch {
      console.log("Admin not found");
      alert("Invalid admin credentials. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className={styles.adminLoginContainer}>
      <div className={styles.adminLoginBox}>
        <div className={styles.adminHeader}>
          <span className={styles.adminIcon}>🔐</span>
          <h1 className={styles.title}>Admin Portal</h1>
          <p className={styles.subtitle}>Secure Administration Dashboard</p>
        </div>

        <form className={styles.form} onSubmit={(e) => e.preventDefault()}>
          <div className={styles.formGroup}>
            <label>Admin Email</label>
            <input
              className={styles.input}
              type="email"
              placeholder="Enter admin email"
              value={adminEmail}
              onChange={(e) => setAdminEmail(e.target.value)}
              disabled={loading}
            />
          </div>

          <div className={styles.formGroup}>
            <label>Admin Password</label>
            <input
              className={styles.input}
              type="password"
              placeholder="Enter admin password"
              value={adminPassword}
              onChange={(e) => setAdminPassword(e.target.value)}
              disabled={loading}
            />
          </div>

          <button
            className={styles.adminLoginButton}
            onClick={handleLogin}
            disabled={loading}
          >
            {loading ? "Verifying..." : "Admin Login"}
          </button>
        </form>

        <div className={styles.securityNote}>
          <span className={styles.lockIcon}>🔒</span>
          <p>
            This is a restricted admin-only area. Unauthorized access is
            prohibited.
          </p>
        </div>

        <Link to="/" className={styles.backLink}>
          ← Back to User Login
        </Link>
      </div>
    </div>
  );
};

export default AdminLogin;
