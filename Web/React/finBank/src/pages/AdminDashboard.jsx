import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../services/api";

const AdminDashboard = () => {
  const navigate = useNavigate();
  const [users, setUsers] = useState([]);
  const [accounts, setAccounts] = useState([]);
  const [transactions, setTransactions] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const adminFlag = localStorage.getItem("isAdmin");
    if (adminFlag !== "true" || !localStorage.getItem("admin")) {
      navigate("/admin");
      return;
    }

    const fetchAdminData = async () => {
      try {
        const [usersRes, accountsRes, transactionsRes] = await Promise.all([
          api.get("/users"),
          api.get("/accounts"),
          api.get("/transactions"),
        ]);

        setUsers(usersRes.data || []);
        setAccounts(accountsRes.data || []);
        setTransactions(transactionsRes.data || []);
      } catch (error) {
        setError(error.message || "Admin data could not be loaded.");
      } finally {
        setLoading(false);
      }
    };

    fetchAdminData();
  }, [navigate]);

  const totalBalance = accounts.reduce(
    (sum, account) => sum + Number(account.balance || 0),
    0,
  );
  const totalUsers = users.length;
  const totalTransactions = transactions.length;

  const handleLogout = () => {
    localStorage.removeItem("admin");
    localStorage.removeItem("isAdmin");
    navigate("/admin");
  };

  if (loading) {
    return (
      <div style={{ padding: "30px", textAlign: "center" }}>
        Loading admin dashboard...
      </div>
    );
  }

  if (error) {
    return (
      <div role="alert" style={{ padding: "30px" }}>
        {error}
      </div>
    );
  }

  return (
    <div style={{ padding: "30px", background: "#f8fafc", minHeight: "100vh" }}>
      <div style={{ maxWidth: "1200px", margin: "0 auto" }}>
        <div
          style={{
            display: "flex",
            justifyContent: "space-between",
            alignItems: "center",
            marginBottom: "30px",
          }}
        >
          <div>
            <h1 style={{ margin: 0, color: "#0f172a" }}>Admin Dashboard</h1>
            <p style={{ margin: "8px 0 0", color: "#64748b" }}>
              Bank operations overview
            </p>
          </div>
          <button
            onClick={handleLogout}
            style={{
              padding: "10px 18px",
              background: "#0f172a",
              color: "#fff",
              border: "none",
              borderRadius: "8px",
              cursor: "pointer",
              fontWeight: 600,
            }}
          >
            Logout
          </button>
        </div>

        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(auto-fit, minmax(220px, 1fr))",
            gap: "20px",
            marginBottom: "30px",
          }}
        >
          <div
            style={{
              background: "#fff",
              padding: "20px",
              borderRadius: "16px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <p style={{ margin: 0, color: "#64748b" }}>Total Users</p>
            <h2 style={{ margin: "10px 0 0", fontSize: "2rem" }}>
              {totalUsers}
            </h2>
          </div>

          <div
            style={{
              background: "#fff",
              padding: "20px",
              borderRadius: "16px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <p style={{ margin: 0, color: "#64748b" }}>Total Accounts</p>
            <h2 style={{ margin: "10px 0 0", fontSize: "2rem" }}>
              {accounts.length}
            </h2>
          </div>

          <div
            style={{
              background: "#fff",
              padding: "20px",
              borderRadius: "16px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <p style={{ margin: 0, color: "#64748b" }}>Transactions</p>
            <h2 style={{ margin: "10px 0 0", fontSize: "2rem" }}>
              {totalTransactions}
            </h2>
          </div>

          <div
            style={{
              background: "#fff",
              padding: "20px",
              borderRadius: "16px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <p style={{ margin: 0, color: "#64748b" }}>Total Balance</p>
            <h2 style={{ margin: "10px 0 0", fontSize: "2rem" }}>
              ₹{totalBalance.toLocaleString()}
            </h2>
          </div>
        </div>

        <div
          style={{
            display: "grid",
            gridTemplateColumns: "1.2fr 1fr",
            gap: "20px",
          }}
        >
          <div
            style={{
              background: "#fff",
              borderRadius: "16px",
              padding: "20px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <h3 style={{ marginTop: 0 }}>Users</h3>
            <div
              style={{ display: "flex", flexDirection: "column", gap: "10px" }}
            >
              {users.map((user) => (
                <div
                  key={user.id}
                  style={{
                    border: "1px solid #e2e8f0",
                    borderRadius: "10px",
                    padding: "12px 14px",
                  }}
                >
                  <strong>{user.username}</strong>
                  <div style={{ color: "#475569", fontSize: "0.9rem" }}>
                    {user.useremail}
                  </div>
                </div>
              ))}
            </div>
          </div>

          <div
            style={{
              background: "#fff",
              borderRadius: "16px",
              padding: "20px",
              boxShadow: "0 8px 20px rgba(15,23,42,0.08)",
            }}
          >
            <h3 style={{ marginTop: 0 }}>Accounts</h3>
            <div
              style={{ display: "flex", flexDirection: "column", gap: "10px" }}
            >
              {accounts.map((account) => (
                <div
                  key={account.id}
                  style={{
                    border: "1px solid #e2e8f0",
                    borderRadius: "10px",
                    padding: "12px 14px",
                  }}
                >
                  <div>
                    <strong>Acc No:</strong> {account.accno}
                  </div>
                  <div style={{ color: "#475569" }}>
                    <strong>Balance:</strong> ₹
                    {Number(account.balance || 0).toLocaleString()}
                  </div>
                </div>
              ))}
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AdminDashboard;
