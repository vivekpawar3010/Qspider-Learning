import { useState } from "react";

let useCounter = (initialValue = 0) =>{

    let [count, setCount] = useState(initialValue);

    let increment = () => {
        setCount(count + 1);
    }
    let decrement = () => {
        setCount(count - 1);
    }
    let reset = () => {
        setCount(0);
    }

    return { count, increment, decrement, reset };
}   

export default useCounter;
