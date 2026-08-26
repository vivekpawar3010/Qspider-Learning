import axios from "axios";
import { useEffect, useState } from "react";

let EffectExapmple2 = () =>{

    // let ok = fetch("").then((res) =>{
    //     return res.json();
    // }).then( (data) =>{
    //     console.log(data);
    // }).catch((err) => {
    //     console.log(err);
    // });
    // console.log(ok);
    
    const [products, setProducts] = useState([]);

    useEffect(() => {
        axios
            .get("https://dummyjson.com/products")
            .then((res) => {
                setProducts(res.data.products || []);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);


    return(
        <div>

            <h1>Effect Examples 2</h1>
            {products.length === 0 ? (
                <p>Loading products...</p>
            ) : (
                products.map((ele, idx) => (
                    <div key={idx}>
                        <h2>{ele.title}</h2>
                        <p>Price: {ele.price}</p>
                        <p>Rating: {ele.rating}</p>
                        <p>Brand: {ele.brand}</p>
                        <img src={ele.thumbnail} alt={ele.title} width="200" />
                    </div>
                ))
            )}
        </div>
    )
    
}
d
export default EffectExapmple2;