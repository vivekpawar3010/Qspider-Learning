let Increment = (props)=>{
    console.log(props.data.count);
    
    return(
        <div style={{height:"100px",width:"70%",border:"2px solid red",background:"white"}}>
            <h1>Increment</h1>
            <button onClick={() => {
                props.data.setCount(props.data.count + 1);
            }}>+</button>
        </div>
    )
}
export default Increment;