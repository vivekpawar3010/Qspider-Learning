import { createRef } from "react";

let Example1 = () => {

    let nameRef = createRef();
    let h1ref = createRef();
    

    let handleSubmit = (e) => {
        e.preventDefault();
        console.log(nameRef.current.value);
        console.log(h1ref.current.style.backgroundColo = "red");   
    }
    return (
        <div>

            <h1 ref={h1ref}>Login form</h1>
            <form>
                <label htmlFor="name">Name:</label>

                <input type="text" id="name" name="name" ref={nameRef} />
                <br />
                <button type="button" onClick={handleSubmit}>Submit</button>
            </form>

            <h1>
                { nameRef?.current?.value || "No name entered yet"}
            </h1>
        </div>
    )
}

export default Example1;