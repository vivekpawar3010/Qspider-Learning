import { useState } from "react";

let Home = () =>{

    let[count, setCount] = useState(0);
    
    return(
        <>
            <h1>This is Home</h1>
            <p>Count: {count}</p>
            <button onClick={() =>{
                console.log(count);
                
                setCount(count + 1);
            }}>Increment</button>
            <button onClick={() => setCount(0)}>Reset</button>
            <button onClick={() => setCount(count - 1)}>Decrement</button>
        </>
    );
};

export default Home;