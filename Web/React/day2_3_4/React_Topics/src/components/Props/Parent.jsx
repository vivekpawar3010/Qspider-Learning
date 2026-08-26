import Child from "./Child"

let Parent =()=>{
    let x =100

    console.log(x,"from parent ");
    
    return (
        <div style={{height:"500px",width:"100%",border:"2px solid black",background:"red"}}>
            <h1>parent component value is {x}</h1>
            <Child data={x}></Child>
        </div>
    )

}
export default Parent