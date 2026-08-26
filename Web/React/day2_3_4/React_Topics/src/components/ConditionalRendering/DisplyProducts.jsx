import { useState } from "react";
import { BounceLoader } from "react-spinners";

const DisplayProducts = () => {


    let[loadproducts , setLoadProducts] = useState(false)

    let products = [
        {
            productName: "Laptop",
            price: 50000
        },
        {
            productName: "Mobile",
            price: 30000
        },
        {
            productName: "Watch",
            price: 5000
        }
    ];

    setTimeout(() => {
        setLoadProducts(true)

    }, 3000);

    return (
        <div>
            <h1>Display Products</h1>

            {
                loadproducts ? (<div>
                      {
                products.map((product, index) => (
                    <h1 key={index}>
                        {product.productName} - {product.price}
                    </h1>
                ))
             }

                </div>) : <BounceLoader></BounceLoader>
            }








            

        </div>
    );
};

export default DisplayProducts;