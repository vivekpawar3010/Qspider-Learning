import Cart from "./Cart"

let Product = ()=>{

    let product = [
        {
            ProductName:"car",
            price:"5L",
        },
        {
            ProductName:"mobile",
            price:"45k"
        },
        {
            ProductName:"laptop",
            price:"80k"
        }
    ]


    return (
        <div style={{height:"600px",width:"90%",border:"2px solid red",background:"yellow"}}>
            <h1>product</h1>
            <Cart data= {product}> </Cart>
        </div>
    )
}
export default Product