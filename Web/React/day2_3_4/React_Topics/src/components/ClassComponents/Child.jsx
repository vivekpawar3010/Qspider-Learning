import { Component } from "react";

class Child extends Component{

        render() {
            console.log(this);
            
            return(
                <div>
                    <h1>this is child class</h1>
                    <h1>Parent data: {this.props.data.productName}</h1>
                    <h1>Parent data: {this.props.data.price}</h1>
                </div>
            )
        }
}

export default Child;