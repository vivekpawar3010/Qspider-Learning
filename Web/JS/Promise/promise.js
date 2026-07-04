// Promise :-
// it is ES6 feature
// let promise= new Promise((resolve, reject) => {
//     resolve("hi"); // Promise {<fulfilled>: 'hi'}
    // reject("bye"); // romise {<rejected>: 'hooh'}
    // if (false) {
    //     resolve("hi");
    // }else{
    //     reject("Bye");
    // }

// });
// console.log(promise);
// promise.then((a) => { // when the success 
//     console.log(a);
// });


// promise.catch((b) => {
//     console.log(b);
// });

// promise.finally(() =>{
//     console.log("Promise is Completed");
    
// });

// let prom2 = new Promise((resovle, reject) =>{
//     let food = {
//         name:"rose water plum",
//         price:1212,
//     }

//     if(true){
//         resovle(food);
//     }else{
//         reject("Order Cancled");
//     }
// });

// prom2.then( (data) => {
//     console.log("Order is done we have");
//     console.log(data.name);
//     console.log(data.price);
    
// });
 
// prom2.catch( (error) => {
//     console.log(error);
// });

// prom2.finally( () => {
//     console.log("Order is Done");
// })


// let result = new Promise((resolve, reject) => {
//     let marks = {
//         Subjects:"Marks",
//         Math:90,
//         English:78,
//         Marathi:88,
//         Hindi:89,
//         Science:57,
//     }

//     if(true){
//         resolve(marks);
//     }else{
//         reject("System Error");
//     }
// });

// result.then( (marks) => {
//     console.log("Your result is:- ");
//     let subjects = Object.keys(marks);
//     let mark = Object.values(marks);
//     console.log(subjects.at(0));
//     console.log(mark);
    
//     for(let i = 0; i < subjects.length; i++){
//         console.log(subjects.at(i) ,"- ", mark.at(i));  
//     }    
    
// }).catch( (error) => {
//     console.log(error);
    
// }).finally( () => {
//     console.log("Task Complted");
// })


// let mul = new Promise( (resolve, reject) => {
//     resolve(2);
// });

// mul.then( (a) =>{
//     console.log(a);
//     return a*a;
// }).then( (a) =>{
//     console.log(a);
//     return a*a;
// }).then( (a) =>{
//     console.log(a);
// })


let x = fetch("https://dummyjson.com/users");
console.log(x);
