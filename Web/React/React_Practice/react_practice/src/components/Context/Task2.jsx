import { createContext } from 'react';
import TaskProfile2 from './TaskProfile2';

export const UserContext2 = createContext({ name: '', age: '', role: '' });
const Task2 = () => {
  return (
    <div>

        <UserContext2.Provider value={{ name: 'Vivek', age: '21', role: 'Developer' }}>
          <TaskProfile2 />
        </UserContext2.Provider>
      
    </div>
  )
}

export default Task2
