import { useEffect, useState } from "react";

let EffectExample = () =>{
    let[count, setCount] = useState(0);

    let [double, setDouble] = useState(10);
    
    
    useEffect(() =>{
        console.log("Component Render");
        
    },[count]);
    // console.log("ok");

    useEffect(() => {
        console.log("Dobule Changing");
    },[]);  
    
    return (
        <>
        
        <h1>this is Example1</h1>
        <h1>{count}</h1>
        <button onClick={() => {
            setCount(count + 1)
        }}>+ inc</button>

        <h1>{double}</h1>
        <button onClick={() =>{
            setDouble(double * 2);
        }}>*2 Dub</button>
        </>
    )
}

export default EffectExample;