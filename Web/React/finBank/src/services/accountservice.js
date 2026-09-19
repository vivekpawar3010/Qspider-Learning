import api from "./api";

let createAccout = async (useraccount) => {
    let responce = await api.post("/accounts", useraccount);
    return responce.data;
}

export default createAccout;

export let getUserAccount = async (userId) => {
    let responce = await api.get(`/accounts?userId=${userId}`);
    return responce.data[0];
}

export let updateAccountBalance = async (accountId, newBalance) => {
    let responce = await api.patch(`/accounts/${accountId}`, { balance: newBalance });
    return responce.data;
}