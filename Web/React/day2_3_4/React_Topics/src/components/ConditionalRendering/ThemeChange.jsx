import { useState } from "react";

let TheamChange = () =>{

    let[theme, setTheme] = useState(0);

    return (
        <div style = {{
            height:"100vh",
            width:"100%",
            backgroundColor: theme? "white":"black",
            color: theme? "black" : "white"
        }} >
            <h1>Them Change</h1>
            <button onClick={() => {
                setTheme(!theme)
            }}
            >Change Theme</button>

        </div>
    )
}


export default TheamChange;