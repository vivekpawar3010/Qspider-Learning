import { createBrowserRouter, RouterProvider } from "react-router-dom"
import AddUser from "./Components/AddUser"
import Home from "./Components/Home"
import EditUser from "./Components/EditUser"
import { ToastContainer } from "react-toastify"
import "react-toastify/dist/ReactToastify.css"
const App = ()=>{

  let router = createBrowserRouter([
    {
      path:"/",
      element:<Home/>
    },
    {
      path:"/addUser",
      element:<AddUser/>
    },
    {
      path:"/editUser/:id",
      element:<EditUser/>
    }
  ])
  return(
    <div>
      <RouterProvider router ={router}/>
        <ToastContainer position="top-right" />
    </div>
  )
}
export default App


// npm i axios
// npm i react-router-dom
// npm i json-server

// npx json-server backend/db.json --watch port 3000   
// command to connect the json db 

//write in the package.json
// "server":"json-server backend/db.json",

// run using the npm run server