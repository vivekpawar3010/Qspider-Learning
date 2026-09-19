export const getStoredUser = () => {
  try {
    return JSON.parse(localStorage.getItem("user") || "null");
  } catch {
    localStorage.removeItem("user");
    return null;
  }
};

export const storeUserSession = (user) => {
  const safeUser = { ...user };
  delete safeUser.userpassword;
  delete safeUser.password;
  localStorage.setItem("user", JSON.stringify(safeUser));
};