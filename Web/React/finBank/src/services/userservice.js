import api from "./api";

let registerUser = async (user) => {
    let response = await api.post("/users", user);
    return response.data;
};

export default registerUser;




export let loginUser = async (email, password) => {
        let response = await api.get(
            `/users?useremail=${encodeURIComponent(email)}&userpassword=${encodeURIComponent(password)}`,
        );

        if (response.data.length === 0) {
            throw new Error("User Not Found");
    }

        return response.data[0];
};

export let loginAdmin = async (email, password) => {
        let response = await api.get(
            `/admins?email=${encodeURIComponent(email)}&password=${encodeURIComponent(password)}`,
        );

        if (response.data.length === 0) {
            throw new Error("Admin Not Found");
    }

        return response.data[0];
};

export let findUserByEmailOrMobile = async (email, mobile) => {
    const [emailResponse, mobileResponse] = await Promise.all([
        api.get(`/users?useremail=${encodeURIComponent(email)}`),
        api.get(`/users?usermobile=${encodeURIComponent(mobile)}`),
    ]);
    return emailResponse.data.length > 0 || mobileResponse.data.length > 0;
};

export let deleteUser = async (userId) => {
    await api.delete(`/users/${userId}`);
};