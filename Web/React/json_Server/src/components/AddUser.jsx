import { useState } from 'react';
import axios from 'axios';
import { toast } from 'react-toastify'; 
import { useNavigate } from 'react-router-dom';

const AddUser = () => {
  const [name, setName] = useState('');
  const [mobile, setMobile] = useState('');
  const [address, setAddress] = useState('');
  const [image, setImage] = useState(null);
  const navigate = useNavigate();


  const handleSubmit = (e) => {
    e.preventDefault();
    
    const newUser = {
      name,
      mobile,
      address,
      image
    };

    axios.post('http://localhost:3000/allUsers', newUser)
      .then(() => {
        // console.log('User added successfully');
        toast.success('User added successfully', {
          position: "top-right",
        });
        navigate('/');
      })
      .catch((error) => {
        console.error('Error adding user:', error);
      });
  };

  let targetImage = (event) => {
    console.log(event.target.files[0]);
    let x = event.target.files[0];
    let reader = new FileReader();

    reader.readAsDataURL(x);

    reader.onload = (ele) => {
      console.log(reader.result);

      setImage(ele.target.result);
    }
  }

  const handleRemoveImage = () => {
    setImage(null);
  }

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="name">Name:</label>
        <input
          type="text"
          id="name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
      </div>
      <div>
        <label htmlFor="mobile">Mobile:</label>
        <input
          type="tel"
          id="mobile"
          value={mobile}
          onChange={(e) => setMobile(e.target.value)}
          required
        />
      </div>
      <div>
        <label htmlFor="address">Address:</label>
        <input
          type="text"
          id="address"
          value={address}
          onChange={(e) => setAddress(e.target.value)}
          required
        />
      </div>
      <div>
        <label htmlFor="image">Image:</label>
        <input
          type="file"
          id="image"
          name="image"
          onChange={targetImage}
        />
        {image && (
          <div style={{ marginTop: '10px' }}>
            <img src={image} alt="Preview" style={{ width: '100px', height: '100px', objectFit: 'cover' }} />
            <button type="button" onClick={handleRemoveImage} style={{ marginLeft: '10px' }}>
              Remove Image
            </button>
          </div>
        )}
      </div>
      <button type="submit">Add User</button>
    </form>
  );
};

export default AddUser;