import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import registerUser, {
  deleteUser,
  findUserByEmailOrMobile,
} from "../services/userservice";
import generateAccount from "../services/generateAccount";
import createAccout from "../services/accountservice";
import styles from "./css/Register.module.css";

const Register = () => {
  let [userName, setUserName] = useState("");
  let [userMobile, setUserMobile] = useState("");
  let [userEmail, setUserEmail] = useState("");
  let [userPassword, setUserPassword] = useState("");
  let [loading, setLoading] = useState(false);

  let nav = useNavigate();

  let handleSubmit = async (e) => {
    e.preventDefault();

    if (!userName || !userMobile || !userEmail || !userPassword) {
      alert("Please fill all fields");
      return;
    }

    setLoading(true);
    try {
      if (!/^\d{10}$/.test(userMobile)) {
        throw new Error("Mobile number must contain 10 digits.");
      }
      if (userPassword.length < 8) {
        throw new Error("Password must contain at least 8 characters.");
      }
      if (await findUserByEmailOrMobile(userEmail, userMobile)) {
        throw new Error("Email or mobile number is already registered.");
      }
      let userData = {
        username: userName,
        usermobile: userMobile,
        useremail: userEmail,
        userpassword: userPassword,
      };

      let user = await registerUser(userData);

      let accno = generateAccount();
      try {
        await createAccout({ userId: user.id, accno, balance: 0 });
      } catch (accountError) {
        await deleteUser(user.id);
        throw accountError;
      }

      alert("Registration successful! Redirecting to login...");
      nav("/");
    } catch (error) {
      alert(error.message || "Registration failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className={styles.registerContainer}>
      <div className={styles.registerBox}>
        <h1 className={styles.title}>Create Account</h1>

        <form className={styles.form} onSubmit={handleSubmit}>
          <div className={styles.formGroup}>
            <label htmlFor="full-name">Full Name</label>
            <input
              className={styles.input}
              type="text"
              placeholder="Enter your full name"
              id="full-name"
              autoComplete="name"
              required
              value={userName}
              onChange={(e) => setUserName(e.target.value)}
              disabled={loading}
            />
          </div>

          <div className={styles.formGroup}>
            <label htmlFor="mobile-number">Mobile Number</label>
            <input
              className={styles.input}
              type="tel"
              placeholder="Enter your phone number"
              id="mobile-number"
              autoComplete="tel"
              required
              value={userMobile}
              onChange={(e) => setUserMobile(e.target.value)}
              disabled={loading}
            />
          </div>

          <div className={styles.formGroup}>
            <label htmlFor="email-address">Email Address</label>
            <input
              className={styles.input}
              type="email"
              placeholder="Enter your email"
              id="email-address"
              autoComplete="email"
              required
              value={userEmail}
              onChange={(e) => setUserEmail(e.target.value)}
              disabled={loading}
            />
          </div>

          <div className={styles.formGroup}>
            <label htmlFor="create-password">Password</label>
            <input
              className={styles.input}
              type="password"
              placeholder="Create a strong password"
              id="create-password"
              autoComplete="new-password"
              minLength="8"
              required
              value={userPassword}
              onChange={(e) => setUserPassword(e.target.value)}
              disabled={loading}
            />
          </div>

          <button
            className={styles.submitButton}
            type="submit"
            disabled={loading}
          >
            {loading ? "Creating Account..." : "Register"}
          </button>
        </form>

        <Link to="/" className={styles.loginLink}>
          Already have an account?{" "}
          <span className={styles.loginLinkText}>Login</span>
        </Link>
      </div>
    </div>
  );
};

export default Register;
