import { Component } from "react";
import Child from "./Child";


class Parent extends Component{


    state = {
        productName:"Laptop",
        price:112100,
    }
    render() {
        return (
            <div>
                <h1>THis is parent class </h1>
                <Child data= {this.state}></Child>
            </div>
        )
    }
}

export default Parent;