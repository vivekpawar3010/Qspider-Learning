import { useEffect, useState } from "react";
import api from "../services/api";
import { useNavigate } from "react-router-dom";
import styles from "./css/DashBoard.module.css";
import { getStoredUser } from "../services/session";

const DashBoard = () => {
  let [account, setAccount] = useState({});
  let [loading, setLoading] = useState(true);
  let [error, setError] = useState("");
  let nav = useNavigate();

  let user = getStoredUser() || {};

  useEffect(() => {
    let fetchAccount = async () => {
      try {
        let accountDetails = await api.get(`/accounts?userId=${user.id}`);
        setAccount(accountDetails.data[0] || {});
      } catch (err) {
        setError(err.message || "Balance data could not be loaded.");
      } finally {
        setLoading(false);
      }
    };
    if (user.id) fetchAccount();
  }, [user.id]);

  return (
    <div className={styles.dashboard}>
      <div className={styles.dashboardContainer}>
        {/* Top Header / Navigation Bar */}
        <header className={styles.topNav}>
          <div className={styles.brand}>
            <div className={styles.bankLogo}>🏛️</div>
            <span className={styles.bankName}>TRUSTED BANK</span>
          </div>
        </header>

        {/* Hero Banner Section */}
        <section className={styles.heroBanner}>
          <div className={styles.heroLeft}>
            <h1 className={styles.greeting}>
              Welcome back, {user.username || "User"}
            </h1>

            {loading ? (
              <p className={styles.loadingText}>Loading balance data...</p>
            ) : error ? (
              <p role="alert">{error}</p>
            ) : (
              <div className={styles.metricsStack}>
                <div className={styles.balanceCard}>
                  <span className={styles.metricLabel}>Available Balance</span>
                  <div className={styles.balanceRow}>
                    <h2 className={styles.balanceAmount}>
                      ₹{" "}
                      {Number(account?.balance || 0).toLocaleString("en-IN", {
                        minimumFractionDigits: 2,
                      })}
                    </h2>
                    <span className={styles.statusBadge}>Active</span>
                  </div>
                </div>

                <div className={styles.accountCard}>
                  <span className={styles.metricLabel}>Account Number</span>
                  <p className={styles.accountNumber}>
                    {account?.accno || "N/A"}
                  </p>
                </div>
              </div>
            )}
          </div>

          {/* Right-side Payment Illustration */}
          <div className={styles.heroRight}>
            <div className={styles.creditCardVisual}>
              <div className={styles.cardChip}></div>
              <div className={styles.cardHeader}>
                <span>TRUSTED BANK</span>
                <span className={styles.cardType}>DEBIT</span>
              </div>
              <div className={styles.cardNumber}>
                •••• •••• •••• {String(account?.accno || "0000").slice(-4)}
              </div>
              <div className={styles.cardFooter}>
                <span>{user.username || "VALUED MEMBER"}</span>
                <span>EXP 09/29</span>
              </div>
            </div>
          </div>
        </section>

        {/* Quick Actions Panel */}
        <section className={styles.actionsSection}>
          <h3 className={styles.sectionHeading}>Quick Services</h3>
          <div className={styles.buttonGrid}>
            <button
              className={styles.primaryAction}
              onClick={() => nav("/moneyTransfer")}
            >
              💸 Money Transfer
            </button>

            <button
              className={styles.secondaryAction}
              onClick={() => nav("/doTransaction")}
            >
              ➕ Add Transaction
            </button>

            <button
              className={styles.secondaryAction}
              onClick={() => nav("/transactions")}
            >
              📄 Transaction History
            </button>
          </div>
        </section>
      </div>
    </div>
  );
};

export default DashBoard;
