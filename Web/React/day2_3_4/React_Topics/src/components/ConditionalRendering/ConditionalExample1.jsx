import { useState } from "react";

let ConditionalExample1 = () =>{
    let[sms, setSms] = useState(true);

    if(sms){
        return(
            <div>
                <h1>
                    Hello This is true
                </h1>
                <button onClick={() => {
                    setSms(false);
                }}>Change Sms</button>
            </div>
        );
    }else{
        return(
            <div>

                <h1>This is From False</h1>
                <button onClick={() => {
                    setSms(true);
                }}>Change Sms</button>
            </div>
        );
    }
};

export default ConditionalExample1;