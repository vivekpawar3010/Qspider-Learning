import { useContext } from 'react';
import { UserContext2 } from './Task2';

const TaskProfile2 = () => {
    const { name, age, role } = useContext(UserContext2);

  return (
    <div>
      <h1>Welcome {name}</h1>
      <p>Age: {age}</p>
      <p>Role: {role}</p>
    </div>
  )
}

export default TaskProfile2
