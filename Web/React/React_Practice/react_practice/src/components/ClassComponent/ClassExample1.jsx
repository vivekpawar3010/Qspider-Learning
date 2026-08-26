import { Component } from "react";

class ClassExample1 extends Component{

    state = {
        count:0,
    }
    render(){
        return(
            <>

                <h1>Class Example 1</h1>

                <h1>{
                    this.state.count
                }           
                </h1>
                <button onClick={
                    () => {this.setState({count:this.state.count += 1})

                }}>+ Inc</button>
                <button onClick={
                    () => {this.setState({count:this.state.count -= 1})
                }}>- Dec</button>
                <button onClick={
                    () => {this.setState({count:this.state.count = 0})
                }}>Reset</button>
            </>
        );
    };
};

export default ClassExample1;