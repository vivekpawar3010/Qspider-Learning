import axios from "axios"
import { toast } from "react-toastify"

const DeleteUser = ({ userId, onDeleted }) => {
	const handleDelete = () => {

		axios.delete(`http://localhost:3000/allUsers/${userId}`)
			.then(() => {
				onDeleted(userId)
				toast.success("User deleted successfully")
			})
			.catch(() => {
				toast.error("Unable to delete user")
			})
	}

	return (
		<button type="button" onClick={handleDelete}>
			Delete
		</button>
	)
}

export default DeleteUser
