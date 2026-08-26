import React, { useCallback, useMemo, useState } from 'react'
import Child from './Child'

const Parent = () => {

    let[count, setCount] = useState(0);
    let[data, setData] = useState(0);

    // let calcuate = useMemo(() => {
    //     console.log("... calculating");
    //     console.log(data);
    //     return data;
    // }, [data]);

    let x = 0;
    let handleSubmit = useCallback(() => {
        x++;
        console.log(x);
    }, []);

  return (
    <div>
      <h1>Parent component {count}</h1>
      <button onClick={() => setCount(count + 1)}>+ inc</button>

        {/* <h1>Data:{calcuate}</h1>
        <button onClick={() => setData(data + 100)}>Increase Data   </button> */}

      <Child></Child>
    </div>
  )
}

export default Parent
