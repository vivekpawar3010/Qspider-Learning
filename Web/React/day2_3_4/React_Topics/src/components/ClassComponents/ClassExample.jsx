import { Component } from "react";


class ClassExample extends Component{

    state= {
        count:0,
    }
    render(){
        return(
            <div>
                <h1>This is class Examples</h1>
                <h1>Count :- {this.state.count}</h1>

                <button onClick={() => this.setState({ count: this.state.count + 1 })}>
                    + inc
                </button>
                <button onClick={() => this.setState({ count: this.state.count - 1 })}>
                    - dec
                </button>
                <button onClick={() => this.setState({ count:0 })}>
                    reset
                </button>
                </div>  
        )
    }
}


export default ClassExample;