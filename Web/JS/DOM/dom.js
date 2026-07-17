// let x = document.getElementById('heading');

// // console.log(x);

// // console.log(x.innerHTML);
// // console.log(x.innerText);

// // x.innerText = "King IS best";

// // x.style.color = "green"


// let red = () => {
//     x.style.color = "red";
// }
// let green = () => {
//     x.style.color = "green";
// }
// let black = () => {
//     x.style.color = "black";
// }
// let blue = () => {
//     x.style.color = "blue";
// }   



// let h1bytagname = document.getElementsByTagName("h1");
// console.log(h1bytagname);

// let h1byclassName = document.getElementsByClassName("heads");
// console.log(h1byclassName);


// let querySel1 = document.querySelector('.heads');
// console.log(querySel1);

// let querySel2 = document.querySelector('#heading');
// console.log(querySel2);

// let querySel3 = document.querySelector('h1');
// console.log(querySel3);



// let querySelAll1 = document.querySelectorAll('.heads');
// console.log(querySelAll1);

// let querySelAll2 = document.querySelectorAll('#heading');
// console.log(querySelAll2);

// let querySelAll3 = document.querySelectorAll('h1');
// console.log(querySelAll3);




// //img fucitons 
// let change = () =>{
//     let img = document.getElementById("goodfriend");
//     let url1 = "https://zivmart.com/wp-content/uploads/2023/11/WhatsApp-Image-2023-10-29-at-8.00.34-PM.jpeg";
//     let url2 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTX1JuGCKM_i8hpTcWuixFLJTL6I1wEbp7WiFJvOfu9lw&s=10";
//     if(img.src === url1){
//         img.src = url2;
//     }else {
//         img.src = url1;
//     }
// }

// let makeCricular = () => {
//     let img = document.getElementById("goodfriend");
//     console.log(img.style.borderRadius);
//     if(img.style.borderRadius === "50%"){
//         img.style.borderRadius = "0%";
//     }else{
//         img.style.borderRadius = "50%";
//     }
// }


// displys the naems ot the ui in the ui 
// let perInfo = fetch('https://dummyjson.com/users');
// perInfo.then( (response) => {
//     return response.json();
// }).then( (data) => {
//     console.log(data);

//     let users = data.users;
//     console.log(users);
//     let userList = document.getElementById("userList");

//     console.log(userList);
    
//     users.forEach( (user) => {
//         let tg = document.createElement("p"); 
//         tg.innerText = user.firstName + " " + user.lastName;
//         userList.appendChild(tg);
//     })
// }).catch( (error) => {
//     console.log(error);
// }).finally( () => {
//     console.log("Task Completed");
// });


// let box = document.getElementById("box");
// console.log(box);
// box.innerHTML = "<h1>This is InnerHtml<h1>"; // as a html tag show on the sreen
// box.innerText = "<h1>This is InnerHtml<h1>"; // as a text will be show in website


// let ele = document.createElement("h1");
// ele.innerText = "this is Qspider";
// // ele.id = "heading1";//way of assigning the id 
// ele.setAttribute("id", "heading1"); //use to assing the new attricbutes to the tags 
// // ele.style.color = "green"; // to use it in the css
// // box.appendChild(ele);
// let elebold = document.createElement("b");
// elebold.innerText = "Learn js";
// // elebold.className = "boldele"; //way of assigning the className

// // box.appendChild(elebold);


// box.append(ele, elebold);   

