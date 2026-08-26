import { useDispatch, useSelector } from 'react-redux';
import { actions } from './main.jsx';

const App = () => {
  const count = useSelector((state) => state.counter);
  console.log("count" ,count);
  const second = useSelector((state) => state.second);
  console.log("second" ,second);

  const dispatch = useDispatch();

  return (
    <>
      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', height: '10vh' }}>
        <h1>Counter: {count}</h1>
        <div>
          <button onClick={() => dispatch(actions.increment())}>Increment</button>
          <button onClick={() => dispatch(actions.decrement())}>Decrement</button>
          <button onClick={() => dispatch(actions.reset())}>Reset</button>
        </div>
      </div>
      
      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', height: '10vh' }}>
        <h1>Second: {second}</h1>
        <div>
          <button onClick={() => dispatch(actions.square())}>Square</button>
          <button onClick={() => dispatch(actions.cube())}>Cube</button>
          <button onClick={() => dispatch(actions.divide2())}>Divide by 2</button>
          <button onClick={() => dispatch(actions.multiply2())}>Multiply by 2</button>
        </div>
      </div>


    </>
  );
};

export default App;
