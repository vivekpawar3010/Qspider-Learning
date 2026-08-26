    let Cart =(props)=>{

    console.log(props);
    console.log(props.data);
    
    return (
        <div style={{height:"400px",width:"70%",border:"2px solid red",background:"pink"}}> 
            <h1>Cart </h1>
        {
            props.data.map((ele,index)=>(
                
               <h4 key={index}>{ele.ProductName} - {ele.price}</h4>
            ))
        }
            
        </div>
    )
}
export default Cart