import { useState } from "react";

let Name = () => {
    let[name, setName] = useState("Ram");

    let update = () => {
       if(name === "Ram") setName("Sham")
        else setName("Ram")
    }

    return(
        <div>
            <h1>The King is : {name}</h1>
            <button onClick={update}>Change Name</button>
        </div>
    );
};

export default Name;