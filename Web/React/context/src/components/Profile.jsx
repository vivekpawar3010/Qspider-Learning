import React, { useContext } from 'react'
import { DataContext } from './ContextContainer';

const Profile = () => {

    let data = useContext(DataContext);
  return (
    <div>
      <h1>This is Profile component</h1>
      <p>Data from context: {data}</p>
    </div>
  )
}

export default Profile
