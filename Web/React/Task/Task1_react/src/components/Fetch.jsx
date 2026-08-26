import { useState } from "react";

const Fetch = () => {
    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(false);

    const loadUsers = async () => {
        setLoading(true);

        try {
            const response = await fetch("https://dummyjson.com/users");
            const data = await response.json();
            setUsers(data.users || []);
        } catch (err) {
            console.log(err);
            setUsers([]);
        } finally {
            setLoading(false);
        }
    };

    return (
        <div>
            <h1>All users from API</h1>
            <button onClick={loadUsers}>Load users</button>
            {loading ? (
                <p>Loading...</p>
            ) : users.length === 0 ? (
                <p>No data found</p>
            ) : (
                users.map((user) => (
                    <div key={user.id} style={{ marginBottom: "1rem" }}>
                        <h2>
                            {user.firstName} {user.lastName}
                        </h2>
                        <p>Age: {user.age}</p>
                        <p>Gender: {user.gender}</p>
                        <p>Email: {user.email}</p>
                        <p>Phone: {user.phone}</p>
                    </div>
                ))
            )}
        </div>
    );
};

export default Fetch;
