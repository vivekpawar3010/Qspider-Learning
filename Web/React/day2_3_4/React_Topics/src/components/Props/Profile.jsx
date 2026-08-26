let Profile =(props)=>{

    console.log(props);
    console.log(props.data);
    console.log(props.data.name);
    
    return (
        <div style={{height:"200px",width:"70%",border:"2px solid red",background:"blue", color:"white"}}>
         <h1>profile</h1>
            <h1>{props.data.name}</h1>
            <h1>{props.data.age}</h1>
            
        </div>
    )
}
export default Profile