import api from "./api";

export let getUserByAccountNumber = async (accountNumber) => {
  let response = await api.get(`/accounts?accno=${accountNumber}`);
  return response.data[0];
};
