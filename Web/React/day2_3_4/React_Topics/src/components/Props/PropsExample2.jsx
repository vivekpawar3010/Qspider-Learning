let PropsExmaple2 = (props) =>{

    console.log(props);
    
    return(
        <div>
            <h1>This is Props Example 2</h1>
            <h1> data : {props.data}</h1>
            {props.children}
        </div>
    )
}

export default PropsExmaple2;