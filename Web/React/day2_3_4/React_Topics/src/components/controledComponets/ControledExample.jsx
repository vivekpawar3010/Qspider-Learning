import { useState } from "react";
import { v4 as uuidv4 } from "uuid";

let ControledExample = () => {
  const [name, setName] = useState("");
  const [mobile, setMobile] = useState("");
  const [userdata, setUserData] = useState([]);
  const [editId, setEditId] = useState(null);

  let handleSubmit = (e) => {
    e.preventDefault();

    if (!name.trim() || !mobile.trim()) {
      return;
    }

    if (editId) {
      let obj = {
        id: editId,
        userName: name,
        userMobile: mobile,
      }
      let filteredData = userdata.filter((user) => user.id !== editId);
      setUserData([...filteredData, obj]);
      setEditId(null);
    } else {
      const user = {
        id: uuidv4(),
        userName: name,
        userMobile: mobile,
      };
      setUserData([...userdata, user]);
    }

    setName("");
    setMobile("");
  };

  let handleDelete = (id) => {
    setUserData(userdata.filter((user) => user.id !== id));

    if (editId === id) {
      setEditId(null);
      setName("");
      setMobile("");
    }
  };

  let handleEdit = (user) => {
    setEditId(user.id);
    setName(user.userName);
    setMobile(user.userMobile);
  };

  return (
    <div>
      <h1>This is Controlled Example</h1>
      <form onSubmit={handleSubmit}>
        <label>Name</label>
        <input
          type="text"
          placeholder="Enter name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <br />
        <br />
        <label>Mobile</label>
        <input
          type="text"
          placeholder="Enter Mobile Number"
          value={mobile}
          onChange={(e) => setMobile(e.target.value)}
        />
        <button type="submit">{editId ? "Update" : "Submit"}</button>
        {editId && (
          <button
            type="button"
            onClick={() => {
              setEditId(null);
              setName("");
              setMobile("");
            }}
            style={{ marginLeft: "10px" }}
          >
            Cancel
          </button>
        )}
      </form>

      <table style={{ border: "1px solid black", marginTop: "20px" }}>
        <thead>
          <tr>
            <th>Sr No</th>
            <th>Name</th>
            <th>Mobile</th>
            <th>Options</th>
          </tr>
        </thead>
        <tbody>
          {userdata.map((user, index) => {
            return (
              <tr key={user.id}>
                <td>{index + 1}</td>
                <td>{user.userName}</td>
                <td>{user.userMobile}</td>
                <td>
                  <button onClick={() => handleEdit(user)}>Edit</button>
                  <button onClick={() => handleDelete(user.id)}>Delete</button>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
};

export default ControledExample;
