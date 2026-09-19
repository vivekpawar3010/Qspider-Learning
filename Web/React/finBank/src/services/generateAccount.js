let generateAccount = () => {
  const values = new Uint32Array(4);
  crypto.getRandomValues(values);
  return Array.from(values)
    .map((value) => String(value).padStart(10, "0"))
    .join("")
    .slice(0, 16);
};

export default generateAccount;