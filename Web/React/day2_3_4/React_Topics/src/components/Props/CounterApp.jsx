import { useState } from "react";
import Increment from "./Increment";
import Decrement from "./Decrement";
import Reset from "./Reset";

let CounterApp =()=>{
    let[count,setCount] = useState(0);
    return(
        <div style={{height:"400px",width:"70%",border:"2px solid red",background:"yellow"}}>
            <h1>Counter App</h1>
            <h1>count : {count}</h1>
            <Increment data={{count, setCount}}></Increment>
            <Decrement data={{count, setCount}}></Decrement>
            <Reset data={{count, setCount}}></Reset>
        </div>
    )
}

export default CounterApp;