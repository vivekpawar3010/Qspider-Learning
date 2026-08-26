import { createBrowserRouter, RouterProvider } from "react-router-dom";
import MuiExample1 from "./components/MuiExample1";
import Header from "./components/Header";
import { Typography } from "@mui/material";
import Home from "./components/Home";
import Profile from "./components/Profile";
import Cart from "./components/Cart";
let App=()=>{
    let router=createBrowserRouter([
        {
            path:'/',
            element:<Header></Header>,
            children:[
                {
                    path:'/home',
                    element:<Home></Home>
                },
                {
                    path:'/profile',
                    element:<Profile></Profile>
                },
                {
                    path:'/cart',
                    element:<Cart></Cart>
                }
            ]

        },
        {
            path:'*',
            element:<Typography variant="h4">URL NOT FOUND</Typography>
        }
    ])
    return (
        <div>
            {/* <MuiExample1/> */}
            <RouterProvider router={router}></RouterProvider>
        </div>
    )
}

export default App;
