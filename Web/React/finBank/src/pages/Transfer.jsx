import { useState } from "react";
import { getUserByAccountNumber } from "../services/transferservice";
import {
  getUserAccount,
  updateAccountBalance,
} from "../services/accountservice";
import { createTransaction } from "../services/transactionService";
import styles from "./css/Transfer.module.css";
import { getStoredUser } from "../services/session";

const Transfer = () => {
  let user = getStoredUser();

  let [accountNumber, setAccountNum] = useState("");
  let [amount, setAmount] = useState("");
  let [description, setDescription] = useState("");
  let [loading, setLoading] = useState(false);
  let [message, setMessage] = useState("");

  let handleSubmit = async (event) => {
    event.preventDefault();
    setMessage("");
    const transferAmount = Number(amount);

    if (
      !accountNumber ||
      !Number.isFinite(transferAmount) ||
      transferAmount <= 0
    ) {
      setMessage("Enter a valid recipient account number and positive amount.");
      return;
    }

    setLoading(true);
    try {
      const [sender, receiver] = await Promise.all([
        getUserAccount(user.id),
        getUserByAccountNumber(accountNumber),
      ]);

      if (!sender || !receiver) throw new Error("Account not found.");
      if (sender.id === receiver.id)
        throw new Error("You cannot transfer to yourself.");
      if (Number(sender.balance) < transferAmount)
        throw new Error("Insufficient balance.");

      await updateAccountBalance(
        receiver.id,
        Number(receiver.balance) + transferAmount,
      );
      await updateAccountBalance(
        sender.id,
        Number(sender.balance) - transferAmount,
      );

      const transferDescription = description || `Transfer to ${accountNumber}`;
      await Promise.all([
        createTransaction({
          userId: user.id,
          accountId: sender.id,
          amount: transferAmount,
          type: "debit",
          description: transferDescription,
        }),
        createTransaction({
          userId: receiver.userId,
          accountId: receiver.id,
          amount: transferAmount,
          type: "credit",
          description: `Transfer from ${sender.accno}`,
        }),
      ]);
      setMessage("Money transfer successful.");
      setAccountNum("");
      setAmount("");
      setDescription("");
    } catch (error) {
      setMessage(error.message || "Transfer failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className={styles.transferPage}>
      <div className={styles.transferBox}>
        <h1 className={styles.title}>Money Transfer</h1>

        <form className={styles.form} onSubmit={handleSubmit}>
          <div className={styles.formGroup}>
            <label>Account Number</label>
            <input
              className={styles.input}
              type="text"
              placeholder="Enter recipient account number"
              value={accountNumber}
              onChange={(e) => setAccountNum(e.target.value)}
            />
          </div>

          <div className={styles.formGroup}>
            <label>Amount (₹)</label>
            <input
              className={styles.input}
              type="number"
              placeholder="Enter transfer amount"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
            />
          </div>

          <div className={styles.formGroup}>
            <label>Description / Note</label>
            <input
              className={styles.input}
              type="text"
              placeholder="e.g. Rent, Utilities, Services"
              value={description}
              onChange={(e) => setDescription(e.target.value)}
            />
          </div>

          <button
            className={styles.submitButton}
            type="submit"
            disabled={loading}
          >
            {loading ? "Processing..." : "Transfer Funds"}
          </button>
          {message && <p role="status">{message}</p>}
        </form>
      </div>
    </div>
  );
};

export default Transfer;
