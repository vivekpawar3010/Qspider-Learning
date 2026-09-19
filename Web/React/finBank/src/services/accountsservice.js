import api from "./api";

let createAccount = async (userAccount) => {
  let responce = await api.post("/accounts", userAccount);
  return responce.data;
};

export default createAccount;
