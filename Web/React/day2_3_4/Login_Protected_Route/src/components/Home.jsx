import { Link } from "react-router-dom";
import "./Auth.css";

let Home = () => {
    return (
        <div className="home-container">
            <button className="btn-primary"><Link to={"/login"}>LOGIN</Link></button>
        </div>
    )
}

export default Home;    