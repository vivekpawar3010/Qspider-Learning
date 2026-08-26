import { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
import { toast } from "react-toastify";

const EditUser = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [formData, setFormData] = useState({ name: "", mobile: "", address: "", image: "" });
    const [loading, setLoading] = useState(true);
    const [image, setImage] = useState(null);

    useEffect(() => {
        axios.get(`http://localhost:3000/allUsers/${id}`)
            .then(({ data }) => setFormData({
                name: data.name ?? "",
                mobile: data.mobile ?? "",
                address: data.address ?? "",
                image: data.image ?? ""
            }))
            .catch(() => toast.error("Unable to load user"))
            .finally(() => setLoading(false));
    }, []);

    const handleChange = (event) => {
        setFormData({ ...formData, [event.target.name]: event.target.value });
    };

    const targetImage = (event) => {
        const x = event.target.files[0];
        const reader = new FileReader();
        reader.readAsDataURL(x);
        reader.onload = (ele) => {
            setImage(ele.target.result);
        };
    };

    const handleRemoveImage = () => {
        setImage(null);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        const updatedData = { ...formData, ...(image && { image }) };
        axios.put(`http://localhost:3000/allUsers/${id}`, updatedData)
            .then(() => {
                toast.success("User updated successfully");
                navigate("/");
            })
            .catch(() => toast.error("Unable to update user"));
    };


   
    return(
        <form onSubmit={handleSubmit}>

            <label htmlFor="name">Name</label>  
            <input type="text" id="name" name="name" value={formData.name} onChange={handleChange} placeholder="Enter Name" required/>
            <br/>
            <br/>
            <label htmlFor="mobile">Mobile</label>
            <input type="tel" id="mobile" name="mobile" value={formData.mobile} onChange={handleChange} placeholder="Enter Mobile" required/>
            <br/>
            <br/>
            <label htmlFor="address">Address</label>
            <input type="text" id="address" name="address" value={formData.address} onChange={handleChange} placeholder="Enter Address" required/>
            <br/>
            <br/>
            <label htmlFor="image">Image</label>
            <input type="file" id="image" name="image" onChange={targetImage} />
            {(image || formData.image) && (
                <div style={{ marginTop: '10px' }}>
                    <img 
                        src={image || formData.image} 
                        alt="Preview" 
                        style={{ width: '100px', height: '100px', objectFit: 'cover' }} 
                    />
                    {image && (
                        <button type="button" onClick={handleRemoveImage} style={{ marginLeft: '10px' }}>
                            Remove New Image
                        </button>
                    )}
                </div>
            )}
            <br />
            <br />
            <button type="submit" disabled={loading}>{loading ? "Loading..." : "Update"}</button>
        
        </form>
    )
}

export default EditUser;