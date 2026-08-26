import axios from 'axios';
import { useEffect, useState } from 'react';
import Cart from './Cart';

const Home = () => {
    const [products, setProducts] = useState([]);
    const [cart, setCart] = useState([]);
    const [showCart, setShowCart] = useState(false);

    useEffect(() => {
        axios.get('https://dummyjson.com/products')
            .then((res) => {
                setProducts(res.data.products || []);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);


    return (
        <div style={{ padding: '20px' }}>
            <h1>Welcome to the Home Page</h1>
            <button onClick={() => setShowCart(!showCart)}>
                {showCart ? 'Products' : 'Cart'}
            </button>

            {showCart ? (
                <Cart cartItems={cart} />
            ) : (
                <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(250px, 1fr))', gap: '20px', marginTop: '20px' }}>
                    {products.length > 0 ? (
                        products.map((ele) => (
                            <div key={ele.id} style={{ border: '1px solid #ccc', padding: '10px', borderRadius: '8px' }}>
                                <h3>{ele.title}</h3>
                                <p>{ele.description}</p>
                                <img src={ele.thumbnail} alt={ele.title} width="200" />
                                <p>Price: ${ele.price}</p>
                                <button onClick={() => setCart((prev) => [...prev, ele])}>Add To cart</button>
                            </div>
                        ))
                    ) : (
                        <p>Loading products...</p>
                    )}
                </div>
            )}
        </div>
    );
};

export default Home;