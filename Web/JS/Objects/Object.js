var userinfoArray = [];

function submit(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("userpass").value;
    let userinfo = {
        username:username,
        pass:password,
    }
    console.log("current use info ",userinfo);
    userinfoArray.push(userinfo);
    console.log("All  user info in the form of array ",userinfoArray);
    
    
}
submit();