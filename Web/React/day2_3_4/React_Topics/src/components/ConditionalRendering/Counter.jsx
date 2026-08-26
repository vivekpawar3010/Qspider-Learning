import { useState } from "react";

let Counter = () => {


    let [count, setCount] = useState(0);
    return (
        <>
        <h1>Counter Example:- </h1>
        <h1>{count}</h1>
        <br />  
        <button onClick={() => {setCount(count + 1)}}>+</button>
        <button
         onClick={() => {setCount(count - 1)}}
         style={{
            display: count>0? "inline":"none",
         }}
         >-</button>
            <button onClick={() => {setCount(0)}}
         style={{
            display: count>0? "inline":"none",
         }}
        >reset</button>
        </>
    );
};

export default Counter;