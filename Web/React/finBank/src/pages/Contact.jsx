import { useState } from "react";
import styles from "./css/Contact.module.css";

const Contact = () => {
  const [activeDept, setActiveDept] = useState("fraud");

  const departments = {
    fraud: {
      title: "Emergency Card & Fraud Defense",
      desc: "Instant freezing of accounts, dynamic CVV overrides, and immediate recovery assistance for unauthorized transactions.",
      value: "1800 200 8560",
      sla: "< 10s Response SLA",
      hours: "Available 24/7/365",
    },
    treasury: {
      title: "Corporate Treasury & High-Value Wire",
      desc: "Direct institutional settlement managers for RTGS operations, multi-currency wire transfers, and liquidity management.",
      value: "+91 22 6120 4400",
      sla: "< 2m Response SLA",
      hours: "Mon - Sat (9 AM - 7 PM)",
    },
    ombudsman: {
      title: "Statutory Grievance & Nodal Desk",
      desc: "Independent regulatory oversight for unresolved disputes, statutory compliance assessments, and escalation audits.",
      value: "nodal.officer@trustedbank.com",
      sla: "24h Resolution SLA",
      hours: "Official Working Hours",
    },
  };

  const current = departments[activeDept];

  return (
    <div className={styles.container}>
      {/* Top Bar */}
      <div className={styles.topSection}>
        <span className={styles.tag}>DIRECT BANKING ASSISTANCE</span>
        <h1 className={styles.heading}>Direct Banking Rails</h1>
      </div>

      {/* Clickable Channel Options */}
      <div className={styles.navRow}>
        <button
          className={`${styles.navBtn} ${activeDept === "fraud" ? styles.activeNav : ""}`}
          onClick={() => setActiveDept("fraud")}
        >
          01 / Cards & Fraud
        </button>
        <button
          className={`${styles.navBtn} ${activeDept === "treasury" ? styles.activeNav : ""}`}
          onClick={() => setActiveDept("treasury")}
        >
          02 / Treasury Desk
        </button>
        <button
          className={`${styles.navBtn} ${activeDept === "ombudsman" ? styles.activeNav : ""}`}
          onClick={() => setActiveDept("ombudsman")}
        >
          03 / Nodal Officer
        </button>
      </div>

      {/* Center Dynamic Details */}
      <div className={styles.detailsSection}>
        <h2 className={styles.deptTitle}>{current.title}</h2>
        <p className={styles.deptDesc}>{current.desc}</p>
        <div className={styles.mainValue}>{current.value}</div>
      </div>

      {/* Bottom Status Ribbon */}
      <div className={styles.bottomBar}>
        <span className={styles.statusBadge}>● {current.hours}</span>

        <span className={styles.metaInfo}>BKC Financial Tower, Mumbai</span>
      </div>
    </div>
  );
};

export default Contact;
