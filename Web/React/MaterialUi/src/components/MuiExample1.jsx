import {Button, Card, Drawer, Typography} from "@mui/material"
import DeleteIcon from '@mui/icons-material/Delete';
import { useState } from "react";

let MuiExample1=()=>{
    let [drawerOpen, setDrawerOpen]=useState(false);
    let [right, setRight]=useState(false);
    let[top, setTop]=useState(false);
    let[bottom, setBottom]=useState(false);
    return (
        <Card>
            <Typography variant="h4" align='center'>
                MUI
            </Typography>
            <Button variant='contained' sx={{ backgroundColor:"red"}} startIcon={<DeleteIcon />}
            onClick={()=>{
                setDrawerOpen(true)
            }}
            >
                Click left
                </Button>

            <Button variant='contained' sx={{ backgroundColor:"red"}} 
            onClick={()=>{
                setRight(true);
            }}>Click right</Button>

             <Button variant='contained' sx={{ backgroundColor:"red"}} 
            onClick={()=>{
                setBottom(true);
            }}>Click Bottom</Button>

             <Button variant='contained' sx={{ backgroundColor:"red"}} 
            onClick={()=>{
                setTop(true);
            }}>Click Top</Button>

            
            
            
            <Drawer open={drawerOpen} onClose={()=>{
                setDrawerOpen(false)
            }} >
                
        
            <Card sx={{height:"100vh", width:"300px"}}>

            </Card>
            </Drawer>

             <Drawer open={right} onClose={()=>{
                setRight(false)
            }} anchor="right">
                
        
            <Card sx={{height:"100vh", width:"300px"}}>

            </Card>
            </Drawer>

            <Drawer open={top} onClose={()=>{
                setTop(false)
            }} anchor="top">
                
        
            <Card sx={{height:"60vh", width:"300px"}}>

            </Card>
            </Drawer>

            <Drawer open={bottom} onClose={()=>{
                setBottom(false)
            }} anchor="bottom">
                
        
            <Card sx={{height:"70vh", width:"300px"}}>

            </Card>
            </Drawer>

        </Card>
    
    )
}

export default MuiExample1;