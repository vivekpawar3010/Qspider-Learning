import { useState } from "react";
import {
  getUserAccount,
  updateAccountBalance,
} from "../services/accountservice";
import { createTransaction } from "../services/transactionService";
import { useNavigate } from "react-router-dom";
import styles from "./css/DoTransaction.module.css";
import { getStoredUser } from "../services/session";

const DoTransaction = () => {
  let nav = useNavigate();

  let [amount, setAmount] = useState(0);
  let [type, setType] = useState("credit");
  let [description, setDescription] = useState("");
  let [loading, setLoading] = useState(false);
  let [message, setMessage] = useState("");
  let user = getStoredUser();

  let handleSubmit = async (e) => {
    e.preventDefault();
    const transactionAmount = Number(amount);
    if (!Number.isFinite(transactionAmount) || transactionAmount <= 0) {
      setMessage("Enter an amount greater than zero.");
      return;
    }

    setLoading(true);
    setMessage("");
    try {
      let account = await getUserAccount(user.id);
      if (!account) throw new Error("Account could not be loaded.");
      if (type === "debit" && Number(account.balance) < transactionAmount) {
        throw new Error("Insufficient balance.");
      }

      let transaction = {
        userId: user.id,
        accountId: account.id,
        amount: transactionAmount,
        type: type,
        description: description,
      };
      await createTransaction(transaction);
      let newBalance = Number(account.balance);

      if (type === "credit") {
        newBalance += transactionAmount;
      } else {
        newBalance -= transactionAmount;
      }

      await updateAccountBalance(account.id, newBalance);
      nav("/transactions");
    } catch (error) {
      setMessage(error.message || "Transaction failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className={styles.transactionPage}>
      <div className={styles.transactionBox}>
        <h1 className={styles.title}>This is do transaction page</h1>

        <form className={styles.form} onSubmit={handleSubmit}>
          <div className={styles.formGroup}>
            <label htmlFor="transaction-amount">Amount: </label>
            <input
              className={styles.input}
              type="number"
              id="transaction-amount"
              min="0.01"
              step="0.01"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
            />
          </div>

          <div className={styles.formGroup}>
            <label htmlFor="transaction-type">Type: </label>
            <select
              className={styles.input}
              id="transaction-type"
              onChange={(e) => setType(e.target.value)}
            >
              <option value="credit">Credit</option>
              <option value="debit">Debit</option>
            </select>
          </div>

          <div className={styles.formGroup}>
            <label htmlFor="transaction-description">Description: </label>
            <input
              className={styles.input}
              id="transaction-description"
              type="text"
              value={description}
              onChange={(e) => setDescription(e.target.value)}
            />
          </div>

          <button
            className={styles.submitButton}
            type="submit"
            disabled={loading}
          >
            {loading ? "Processing..." : "Submit"}
          </button>
          {message && <p role="status">{message}</p>}
        </form>
      </div>
    </div>
  );
};

export default DoTransaction;
