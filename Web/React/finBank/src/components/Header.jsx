import { Outlet, useNavigate, useLocation, NavLink } from "react-router-dom";
import styles from "../pages/css/Header.module.css";
import { getStoredUser } from "../services/session";

const Header = () => {
  let nav = useNavigate();
  let location = useLocation();

  const user = getStoredUser();

  return (
    <div className={styles.appContainer}>
      {/* Left Static Sidebar */}
      <aside className={styles.sidebarSection}>
        <div className={styles.brandHeader}>
          <span className={styles.brandIcon}>🏛️</span>
          <h2 className={styles.brandTitle}>TRUSTED BANK</h2>
        </div>

        <nav className={styles.navMenu}>
          <NavLink
            to="/dashboard"
            className={`${styles.navItem} ${location.pathname === "/dashboard" ? styles.active : ""}`}
          >
            <span className={styles.accentBar}></span>
            <span className={styles.navBtn}>Dashboard</span>
          </NavLink>

          <NavLink
            to="/about"
            className={`${styles.navItem} ${location.pathname === "/about" ? styles.active : ""}`}
          >
            <span className={styles.accentBar}></span>
            <span className={styles.navBtn}>About</span>
          </NavLink>

          <NavLink
            to="/contact"
            className={`${styles.navItem} ${location.pathname === "/contact" ? styles.active : ""}`}
          >
            <span className={styles.accentBar}></span>
            <span className={styles.navBtn}>Contact</span>
          </NavLink>
        </nav>

        <div className={styles.bottomSection}>
          <div className={styles.userProfile}>
            <div className={styles.avatar}>
              {user?.username?.charAt(0) || "U"}
            </div>
            <div className={styles.userInfo}>
              <p className={styles.userName}>{user?.username || "Guest"}</p>
              <span className={styles.userStatus}>
                {user ? "Signed in" : "Guest"}
              </span>
            </div>
          </div>
          <button
            className={styles.logoutBtn}
            onClick={() => {
              localStorage.removeItem("user");
              nav("/");
            }}
          >
            Logout
          </button>
        </div>
      </aside>

      {/* Right Main Content */}
      <main className={styles.mainSection}>
        <Outlet />
      </main>
    </div>
  );
};

export default Header;
