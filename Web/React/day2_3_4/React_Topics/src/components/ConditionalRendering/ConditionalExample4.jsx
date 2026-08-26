import { useState } from "react";

let ConditionalExample4 = () =>{
    let[count, setCount] = useState(0);

    let increase = () =>{
        setCount(count + 1);
    };
    let decrease = () =>{
        if(count > 0)setCount(count - 1);
        else setCount(0);
    };
    let reset = () =>{
        setCount(0);
    }
    if(count == 0){
        return(
            <div>
                <h1> Count:- {count}</h1>
                <button onClick={increase}>Increase</button>
            </div>
        );
    }else{
        return(
            <div>
                <h1> Count:- {count}</h1>
                <button onClick={increase}>Increase</button>
                <button onClick={decrease}>Decrease</button>
                <button onClick={reset}>Reset</button>
            </div>
        );
    }
};

export default ConditionalExample4;