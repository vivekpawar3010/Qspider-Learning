import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import Support from "./Support";
import "./Products.css"

const fallbackProducts = [
    {
        id: "fallback-1",
        title: "Wireless Headphones",
        price: 59.99,
        rating: 4.6,
        thumbnail: "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?auto=format&fit=crop&w=600&q=80"
    },
    {
        id: "fallback-2",
        title: "Minimal Backpack",
        price: 44.5,
        rating: 4.4,
        thumbnail: "https://images.unsplash.com/photo-1553062407-98eeb64c6a62?auto=format&fit=crop&w=600&q=80"
    },
    {
        id: "fallback-3",
        title: "Classic Watch",
        price: 89,
        rating: 4.8,
        thumbnail: "https://images.unsplash.com/photo-1524805444758-089113d48a6d?auto=format&fit=crop&w=600&q=80"
    }
];

let Products = () => {
    let nav = useNavigate();
    let currentUser = JSON.parse(localStorage.getItem("currentUser") || "null");

    let [products, setProducts] = useState([]);
    let [showSupport, setShowSupport] = useState(false);
    let [isLoading, setIsLoading] = useState(true);
    let [loadError, setLoadError] = useState("");

    let handleLogout = () => {
        localStorage.removeItem("token");
        localStorage.removeItem("currentUser");
        nav("/login", { replace: true });
    };

    let handleSupport = () => {
        setShowSupport(true);
    };

   
    useEffect(() => {
        axios.get("http://localhost:3000/products").then((res) => {
            setProducts(res.data.length ? res.data : fallbackProducts);
        }).catch(() => {
            setProducts(fallbackProducts);
            setLoadError("JSON Server is not running. Showing sample products.");
        }).finally(() => {
            setIsLoading(false);
        });
    }, [])



    return (
        <div className="products-page">
            <header className="products-header">
                <div>
                    <p className="welcome-message">Welcome, {currentUser?.userName}</p>
                    <h1 className="page-title">Products</h1>
                </div>
                
            </header>
            {isLoading && <p className="products-status">Loading products...</p>}
            {loadError && <p className="products-status products-warning">{loadError}</p>}
            <div className="products-grid">
                {
                    products.map((ele, idx) => {
                        return (
                            <div className="product-card" key={idx}>
                                <img src={ele.thumbnail} alt="" />
                                <h1>{ele.title}</h1>
                                <h1 className="product-price">${ele.price}</h1>
                                <h1 className="product-rating">⭐ {ele.rating}</h1>
                            </div>
                        )
                    })
                }
            </div>
            <div>
                <button className="btn-secondary logout-button" onClick={handleLogout}>Logout</button>
                <button className="btn-secondary logout-button" onClick={handleSupport}>Support</button>
            </div>
            {showSupport && <Support />}


        </div>
    )

}

export default Products;