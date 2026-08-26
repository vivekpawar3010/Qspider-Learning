import { useContext } from 'react';
import { UserContext } from './Task1';

const Task1Profile = () => {
  const { name } = useContext(UserContext);

  return (
    <div>
      Welcome {name}
    </div>
  )
}

export default Task1Profile
