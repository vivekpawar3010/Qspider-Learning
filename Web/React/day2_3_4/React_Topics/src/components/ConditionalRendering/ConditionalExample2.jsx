import { useState } from "react";

let ConditionalExample2 = () =>{
    let[sms, setSms] = useState(true);

    if(sms){
        return(
            <div>
                <h1>
                    Login SuccesFull <br />
                    WelCome User
                </h1>
                <button onClick={() => {
                    setSms(false);
                }}>LogOut</button>
            </div>
        );
    }else{
        return(
            <div>

                <h1>Please Login</h1>
                <button onClick={() => {
                    setSms(true);
                }}>Login</button>
            </div>
        );
    }
};

export default ConditionalExample2;