import axios from "axios"
import { useEffect, useState } from "react"
import { Link } from "react-router-dom"
import { toast } from "react-toastify"
import DeleteUser from "./DeleteUser"

const Home = ()=>{

    let [userData, setUserData]= useState([])
    
    useEffect(()=>{
        axios.get("http://localhost:3000/allUsers").then((res)=>{
            console.log(res.data);
            setUserData(res.data)
        }).catch(() => {
          toast.error("Unable to load users")
        })
    },[])

      const removeDeletedUser = (id) => {
        setUserData((users) => users.filter((user) => user.id !== id))
      }

  return(
    <div>
        <button>
            <Link to={"/addUser"}>New User</Link>
        </button>

      <table border={1} style={{
        borderCollapse:"collapse",
        width:"100%"
      }}>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Mobile</th>
                <th>Address</th>
                <th>Image</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            {userData.map((ele, index)=>(
                <tr key={index}>
                    <td>{ele.id}</td>
                     <td>{ele.name}</td>
                      <td>{ele.mobile}</td>
                       <td>{ele.address}</td>
                       <td>
                         {ele.image ? (
                           <img src={ele.image} alt={ele.name} style={{ width: '50px', height: '50px', objectFit: 'cover' }} />
                         ) : (
                           <span>No Image</span>
                         )}
                       </td>
                       <td>
                         <button>
                            <Link to={`/editUser/${ele.id}`}>Edit</Link>
                         </button>
                         <DeleteUser userId={ele.id} onDeleted={removeDeletedUser} />
                       </td>
                </tr>
            ))}
        </tbody>

      </table>
    </div>
  )
}
export default Home