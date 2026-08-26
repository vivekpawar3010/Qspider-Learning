import { createContext } from 'react';
import Task1Profile from './Task1Profile';

export const UserContext = createContext({name:""});

const Task1 = () => {
  return (
    <div>
      <UserContext.Provider value={{ name: 'Vivek' }}>
        <Task1Profile />
      </UserContext.Provider>
    </div>
  )
}

export default Task1
