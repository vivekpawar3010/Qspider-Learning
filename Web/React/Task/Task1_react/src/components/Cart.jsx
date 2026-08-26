// import React from 'react';

const Cart = ({ cartItems = [] }) => {

    // let[totalPrice, setTotalPrice] = React.useState(0);


    return (
        <div style={{ marginTop: '20px' }}>
            <h2>Welcome to the Cart Page</h2>

            {cartItems.length > 0 ? (
                cartItems.map((item, idx) => (
                    <div key={idx} style={{ border: '1px solid #ccc', padding: '10px', marginBottom: '10px', borderRadius: '8px' }}>
                        <h3>{item.title}</h3>
                        <p>Price: ${item.price}</p>
                        <img src={item.thumbnail} alt={item.title} width="200" />
                    </div>
                ))
            ) : (
                <p>Your cart is empty.</p>
            )}

            <h3>Total Price: ${cartItems.reduce((total, item) => total + item.price, 0)}</h3>
        </div>
    );
};

export default Cart;