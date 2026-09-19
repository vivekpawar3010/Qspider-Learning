import api from "./api";

export let getTransaction = async (userId, accountId) => {
  let responce = await api.get(
    `/transactions?userId=${userId}&accountId=${accountId}`,
  );
  return responce.data;
};

export let createTransaction = async (transaction) => {
  let responce = await api.post(`/transactions`, transaction);
  return responce.data;
};
