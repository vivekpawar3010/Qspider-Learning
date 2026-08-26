let Child =(props)=>{

    console.log(props);
    console.log(props.data);
    
    return (
        
        <div style={{height:"200px",width:"70%",border:"2px solid red",background:"black",color:"white"}}>
            <h1> child component value is : {props.data}</h1>
        </div>
    )
}
export default Child;