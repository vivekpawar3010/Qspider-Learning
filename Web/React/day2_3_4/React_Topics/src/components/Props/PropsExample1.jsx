import PropsExmaple2 from "./PropsExample2";

let PropsExmaple1 = () =>{
    let x = 100;
    return(
        <div>
            <h1>This is Props Example 1</h1>
            <PropsExmaple2 data= {x} >Data is Sending</PropsExmaple2>
        </div>
    )
}

export default PropsExmaple1;