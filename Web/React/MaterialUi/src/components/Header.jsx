import { Button, Card, CardContent, Drawer, Menu, Paper } from "@mui/material";
import { useState } from "react";
import { Outlet, useNavigate } from "react-router-dom";

let Header=()=>{

    let[drawerOpen, setDrawerOpen]=useState(false);
    let nav=useNavigate();
    return (
       <>
        <Card sx={{height:"100px", width:"100%"}}>
            <CardContent component={Paper} sx={{display:"flex", justifyContent:"center", gap:"30px"}}>
                <Button variant='contained' onClick={()=>{
                    setDrawerOpen(true)
                }}>Menu</Button>
                <Button variant='contained' onClick={()=>{
                    nav("/home");
                }}>Home</Button>
                 <Button variant='contained'  onClick={()=>{
                    nav("/profile");
                }}>Profile</Button>
                 <Button variant='contained'  onClick={()=>{
                    nav("/cart");
                }}>Cart</Button>


            </CardContent>
        </Card>

        <Drawer open={drawerOpen} onClose={()=>{
            setDrawerOpen(false);
        }}>
            <Card  sx={{height:"100vh", width:"300px",}}>
                <CardContent sx={{height:"50%", width:"100%", display:"flex",
                    flexDirection:"column",
                    justifyContent:"center",
                    alignItems:"center",
                    gap:"30px"
                }} >
                    <Button variant="contained" sx={{width:"200px"}}  onClick={()=>{
                    nav("/home");
                }}>Home</Button>
                     <Button variant="contained" sx={{width:"200px"} }  onClick={()=>{
                    nav("/profile");
                }}>Profile</Button>
                    <Button variant="contained" sx={{width:"200px"}}  onClick={()=>{
                    nav("/cart");
                }}>Cart</Button>


                </CardContent>
            </Card>
        </Drawer>

        <Outlet></Outlet>
       </>
    )
}

export default Header;