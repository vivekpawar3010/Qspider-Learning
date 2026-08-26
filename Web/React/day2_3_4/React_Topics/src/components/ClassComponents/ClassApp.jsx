import { Component } from "react";
// import ClassExample from "./ClassExample";
import Parent from "./Parent";

class ClassApp extends Component{



    render(){
        return(
           <div>
             <h1>This is Class App</h1>
             {/* <h1>State Value: {count}</h1> */}
            {/* <ClassExample></ClassExample> */}
            <Parent></Parent>
           </div>
        )
    }
}

export default ClassApp;