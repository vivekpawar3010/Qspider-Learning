import styles from "./css/About.module.css";

const About = () => {
  return (
    <div className={styles.aboutWrapper}>
      {/* Left 50% Typography Section */}
      <div className={styles.textSection}>
        <div>
          <span className={styles.categoryTag}>OUR PHILOSOPHY</span>
          <h1 className={styles.mainHeading}>
            Banking Built On Absolute Trust
          </h1>

          <p className={styles.leadText}>
            Trusted Bank was built to make digital finance frictionless, secure,
            and accessible for everyone.
          </p>

          <p className={styles.bodyText}>
            We are dedicated to building a smarter financial experience every
            day. By combining institutional-grade encryption with instant UPI
            and wire routing, we give you absolute control over your money
            without the complexity of traditional banking branches.
          </p>
        </div>

        <div className={styles.actionRow}>
          <button className={styles.learnMoreBtn}>Learn More</button>
          <span className={styles.statNotice}>• 100% RBI Regulated</span>
        </div>
      </div>

      {/* Right 50% Financial Headquarters Image */}
      <div className={styles.imageSection}>
        <img
          src="https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?auto=format&fit=crop&w=1200&q=80"
          alt="Trusted Bank Headquarters"
          className={styles.heroImg}
        />
      </div>
    </div>
  );
};

export default About;
