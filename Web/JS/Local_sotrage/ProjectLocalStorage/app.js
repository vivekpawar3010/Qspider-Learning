let userInfo = JSON.parse(localStorage.getItem("users")) || []; 

let login = () => { 
    let username = document.getElementById("username").value; 
    let password = document.getElementById("password").value; 
    
    let matchedUser = isinUserObje(username, password);
    
    if (matchedUser) { 
        localStorage.setItem("currentUserRole", matchedUser.role);
        window.location.href = "Home.html"; 
    } else {
        alert("Invalid username or password");
    }
} 

let create = () => { 
    window.location.href = "Register.html"; 
} 

let register = () => { 
    let username = document.getElementById("username").value; 
    let password = document.getElementById("password").value; 
    let role = document.getElementById("role").value; 
    
    let newUser = {
        username: username,
        password: password,
        role: role
    };
    
    userInfo.push(newUser);
    
    localStorage.setItem("users", JSON.stringify(userInfo));
    
    alert("Registration successful!");
} 

let isinUserObje = (username, password) => { 
    return userInfo.find(user => user.username === username && user.password === password);
}
