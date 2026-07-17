// let containers = document.getElementsByClassName('container');

// for (let container of containers) {
//   container.addEventListener("mouseover ", (a) => {
//     container.style.backgroundColor = 'green';
//     console.log(a.type); // Outputs: "click"
//   });
// }

// let box = document.getElementById("box");
// let username = document.getElementById("username");
// let click = document.getElementById("btn");
// click.addEventListener("click", () => {
//     let id = username.value;
//     console.log(id);
//     let h1 = document.createElement("h1");
//     h1.innerText = id;
//     box.appendChild(h1);
 
// });


// keydown - when key press or down this will triger
// keyup - when key unpress or up this will triger
// change - tirggger only when press the "Enter" key 
// let box = document.getElementById("box");
// let username = document.getElementById("username");
// let click = document.getElementById("btn");
// username.addEventListener("change", () => {
//     let len = username.value.length;
//     console.log(len);
//     let h1 = document.createElement("h1");
//     h1.innerText = len;
//     box.appendChild(h1);
 
// });



// let box = document.getElementById("box");
// let username = document.getElementById("username");
// let nameerror = document.getElementById("nameerror");
// let password = document.getElementById("password");
// let passerror = document.getElementById("passerror");
// let btn = document.getElementById("btn");

// btn.addEventListener( "click", () =>{
//     let userN = username.value;
//     let pass = password.value;
//     if(userN.length <= 3 || pass.length <= 5){
//         if(userN.length <= 3)
//         {
//             nameerror.innerHTML = "";
//             nameerror.style.color = "red";
//         }
//         if(pass.length <= 5){
//             passerror.innerHTML = "";
//         passerror.style.color = "red";
//         }
//     }else{
//         window.location.href = "vivekpawar.vercel.app"
//     }
// });



// setTimeOut fution to deay the taks exituctiosn

// console.log("start");
// let x = setTimeout(() => {
//     console.log("this is setTimeOut");
// }, 2000);   


// clearTimeout(x); // to cncle the run of hte settimeoUt
// console.log("start");
// var l = 1;
// let x = setInterval(() => {
//     console.log("this is setTimeOut", l++);
// }, 1000);   
// setTimeout(() => {
//     clearInterval(x);
// }, 5000); // to cncle the run of hte settimeoUt

let hr = document.getElementById("hr");
console.log(typeof hr.innerText);
let min = document.getElementById("min");
let sec = document.getElementById("sec");

let strtbtn = document.getElementById("start");
let stopbtn = document.getElementById("stop");
let resetbtn = document.getElementById("reset");
var check = true;
let h = 0;
let m = 0;
let s = 0;
strtbtn.addEventListener("click", () => {
    
    var x = setInterval(() => {
        if(s < 59){
            s++;
        } else if(m < 59){
            m++;
            if(h < 23){
            h++;
            m = 0;
        }
        s = 0;
        } 
        hr.innerText = h;
        min.innerText = m;
        sec.innerText = s;
        if(check == false){
            clearInterval(x);
        }
    }, 1000);
});

stopbtn.addEventListener("click", () => {
    check = false;
});

resetbtn.addEventListener("click", () => {
    check = false;
    hr.innerText = 0;
    min.innerText = 0;
    sec.innerText = 0;
});