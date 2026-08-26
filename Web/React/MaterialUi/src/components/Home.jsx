import { Button, Card, CardContent, Typography } from "@mui/material"
import { useNavigate } from "react-router-dom";


let Home=()=>{
    let nav=useNavigate()
    return(
       <>
       <Card sx={{height:"100vh", width:"100%"}}>
        <CardContent sx={{height:"50%", backgroundColor:"aliceblue", textAlign:"center" }}>
            <Typography variant="h1">Home Component</Typography>
            <Button variant='contained' sx={{height:"50px", width:"200px", marginTop:"200px"}} onClick={()=>{
                nav("/")
            }}>Back</Button>
        </CardContent>
       </Card>
       </>
    )
}
export default Home;