import Profile from "./Profile"



let Home =()=>{
    let user = {
        name:"chaitanya",
        age:"22"
    }
    return (
        <div style={{height:"400px",width:"70%",border:"2px solid red",background:"yellow"}}>
            <h1>Home</h1>
            <Profile data={user}></Profile>
        </div>
    )
}
export default Home