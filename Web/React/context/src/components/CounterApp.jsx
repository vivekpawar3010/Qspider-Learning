import React from 'react'
import useCounter from './UseCounter';

const CounterApp = () => {

    let { count, increment, decrement, reset } = useCounter(10);
  return (
    <div>
      <h1>Counter: {count}</h1>
      <button onClick={increment}>+</button>
      <button onClick={decrement}>-</button>
      <button onClick={reset}>Reset</button>    
    </div>
  )
}

export default CounterApp
