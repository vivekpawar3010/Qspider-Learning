import { useState } from "react";

let ConditionalExample3 = () =>{
    let[sms, setSms] = useState(true);

    let circle = {
        height: "200px",
        width:"200px",
        backgroundColor:"red",
        borderRadius:"50%",
    };
    let square = {
        height: "200px",
        width:"200px",
        backgroundColor:"red",
    };
    if(sms){
        return(
            <div>
                <div id="square" style={square}></div>
                <button onClick={() => {
                    setSms(false);
                }}>Chage Shape</button>
            </div>
        );
    }else{
        return(
            <div>

                <div id="circle" style={circle}></div>
                <button onClick={() => {
                    setSms(true);
                }}>Change Shape</button>
            </div>
        );
    }
};

export default ConditionalExample3;