import { useEffect, useState } from "react";
import { getTransaction } from "../services/transactionService";
import { getUserAccount } from "../services/accountservice";
import { getStoredUser } from "../services/session";

import styles from "./css/Transactions.module.css";

const Transactions = () => {
  let user = getStoredUser();
  let [allTransactions, setAllTransactions] = useState([]);
  let [loading, setLoading] = useState(true);
  let [error, setError] = useState("");

  useEffect(() => {
    let fetchTransactions = async () => {
      try {
        let accountDetails = await getUserAccount(user.id);
        if (!accountDetails) throw new Error("Account could not be loaded.");

        let transactionsDetails = await getTransaction(
          user.id,
          accountDetails.id,
        );
        setAllTransactions(transactionsDetails);
      } catch (requestError) {
        setError(requestError.message || "Transactions could not be loaded.");
      } finally {
        setLoading(false);
      }
    };

    fetchTransactions();
  }, [user.id]);

  return (
    <div className={styles.transactionsPage}>
      <h1 className={styles.title}>All Transactions</h1>

      <div className={styles.transactionsContainer}>
        {loading && <p role="status">Loading transactions...</p>}
        {!loading && error && <p role="alert">{error}</p>}
        {!loading && !error && allTransactions.length === 0 && (
          <p>No transactions found.</p>
        )}
        {!loading &&
          !error &&
          allTransactions.map((ele) => {
            return (
              <div key={ele.id} className={styles.transactionCard}>
                <h2>₹ {Number(ele.amount).toLocaleString("en-IN")}</h2>
                <p>{ele.description}</p>
                <span>{ele.type}</span>
              </div>
            );
          })}
      </div>
    </div>
  );
};

export default Transactions;
