// let documen  t = document.getElementsByTagName("body");


// function submit() {
//     // console.log("Funtion called");
//     let x = document.getElementById("username");
//     console.log(x.value);
//     console.log(Number(x.value));
    
// }


// function sum(){
//     let a = document.getElementById("firstnum");
//     let b = document.getElementById("secondnum");
//     if(a.value === "" || b.value === ""){
//         alert("Not all credeintials entered \n Please enter all credentials")
//     }

//     console.log(Number(a.value) + Number(b.value));
// }



// normal functino
// function demo(a) {
//     return a;
// }

// let x = demo(12);
// console.log(x);
// arrow funcitno

// let arrFun = a =>{
//     console.log("this is the arrow funciton" , a);
// }


// let arrFun = a =>{
//     return a + a;
// }
// let arrFun = a => a + a;// no need to use the paranthesis 
// let y = arrFun(10);
// console.log(y);

// // it return inclicitly 
// let arrow = a => a+ a;
// arrow(2);

// arrow funciton si not hideted 



// nested function
// function inside another fucntion is called the nested function

    // function outerfuction(){
    //     console.log("THis is outer fucntion");
    //     function innerfunction() {
    //         console.log("This is a inner function");
    //     }
    //     innerfunction();
    // }
    // outerfuction();


// highter order functino 
// function demo(a, b,c) {
//     console.log(a);
//     console.log(b);
//     c();
// }

// demo(10, "asdf", function () {
//     console.log("helolo");
    
// });

// let demo = (a, b, c) => {
//     console.log(a);
//     console.log(b);
//     c();
// }


// demo(10, "asdf", function () {
//     console.log("helolo");
    
// });



// let add = (a, b, c) => {
//     let result = a + b;
//     c(result);
// }
// add(10, 12,(x) =>{
//     console.log(x);
// }); 

// let even = (a, b) =>{
//     if(a % 2 == 0){
//         b("even");
//     }else{
//         b("odd");
//     }
// }

// even(12, (x) =>{
//     console.log(x);
// });



