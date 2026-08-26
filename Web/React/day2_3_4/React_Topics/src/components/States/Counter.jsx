import { useState } from "react";

let Counter = () => {
    let [count, setCount] = useState(0);
    // let increment = () => {
    //     setCount(count + 1); 
    // }
    // let decrement = () => {
    //     setCount(count - 1); 
    // }
    // let reset = () => {
    //     setCount(0); 
    // }
    console.log("component Created");
    
  return (
    <div>
        <h1>Counter Component</h1>

        <h1>Value: {count}</h1>
        <button onClick={() => {
        setCount(count + 1); 
    }}>Increment</button>
        <button onClick={() => {
        setCount(count - 1); 
    }}>Decrement</button>
        <button onClick={() => {
        setCount(0); 
    }}>Reset</button>
    </div>
  );
};

export default Counter;