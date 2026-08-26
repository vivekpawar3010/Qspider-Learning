import React, { useContext } from 'react'
import { DataContext } from './ContextContainer';

const Home = () => {
    let data = useContext(DataContext);
  return (
    <div>
      <h1>THis is Home component</h1>
    </div>
  );
};
export default Home;
