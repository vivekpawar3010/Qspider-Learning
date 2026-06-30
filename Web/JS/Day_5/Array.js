// let arr = [1,2,3,4,5,6,7,8,9];
// console.log(arr);
// console.log(typeof arr);
// console.log(arr.length);
// console.log(arr[1]);



// let arr = [];

// console.log(arr);
// arr[0] = 11;
// console.log(arr);
// arr[1] = 22;
// console.log(arr);
// arr[4] = 44;
// console.log(arr);
// console.log(arr.length);



// let arr = [];
// arr[1] = 100;
// arr[100] = 1;
// console.log(arr);


// let product = ["aaa", "bbb", "ccc", "ddd", "eee", "fff"];
// console.log(product);

// product[3] = "ttt";
// console.log(product);


// let product = ["aaa", "bbb", "ppp"];

// console.log(product);

// product[3] = "ccc";
// product[4] = "ddd";
// console.log(product);

// product.push("rrr", 'sss');
// console.log(product);
// product.pop();
// product.pop();
// console.log(product);


// product.unshift("rrr", 'sss');
// console.log(product);

// product.shift();
// product.shift();
// product.shift();
// console.log(product);

// let currproducts = [];

// let submit = () => {
//     let product = document.getElementById("product");
//     if(product.value.length == 0) {
//         alert("Please Add the product");
//         return ;
//     }
//     currproducts.push(product.value.toLowerCase());
//     console.log(currproducts);   
//     product.value = ""; 
// }
// submit()



//splice funtion:-
// let arr = ["Mobile", "Laptop", "Shoes", "Watch"];
// console.log(arr);
// arr.splice(1,2,"Tv", "Washing Machine");
// console.log(arr);

// let arr = ["Mobile", "Laptop", "Shoes", "Watch"];
// console.log(arr);

// let x = arr.slice(1,3);
// console.log(x);
// let y = arr.slice(1);
// console.log(y);



//tracing the array 

// let arr = ["Mobile", "Laptop", "Shoes", "Watch"];
// console.log(arr);

// let display = (ele, idx) =>{
//     console.log(idx, "-", ele);
// }

// for(let i = 0; i < arr.length; i++){
//     display(arr[i], i);
// }

// //built in methods to print the arr
// arr.forEach((ele, idx, aasa)=>{
//     console.log(ele, idx,aasa, "in for each function");
    
// });


// let nums = [111,222,333,444,555,666, 777, 888];
// let x = nums.forEach((ele, idx, arr) =>{
//     console.log(idx, " - ", ele);
//     let num = arr[idx]
//     arr[idx] = [num];
//     console.log(idx, " - ", ele, arr);
//     arr[idx] = num;
// })

// console.log(x);



// let nums = [10, 20, 30, 40, 50, 60];
// console.log(nums);
// let nums2 = [];
// console.log(nums2);
// nums.forEach((ele, idx) => {
//     nums2[idx] = ele * 2;
// });
// console.log(nums);
// console.log(nums2);

// //use the map inpubild function for the same thing.
// let x = nums.map((ele, idx, num) => {
//     return ele * 2;
// })
// console.log(x);



// let products = ["Mobiles", "Laptops", "Tvs", "Watchs"];
// let products2 = products.map((ele) => {
//     return ele.toUpperCase();
// })

// console.log(products);
// console.log(products2);

// let pro3 = products.map(
//     (ele) =>{
//         return ele.substring(0, 2).toUpperCase();
//     }
// )
// console.log(pro3);



// let nums = [10, 20, 30, 40, 50, 60];
// console.log(nums);
//map return the undifined values and add them to the array
// let num2 = nums.map(
//     (ele) =>{
//         if(ele > 30) return ele;
//     }
// )
// console.log(num2);



// 
// let nums3 = nums.filter(
//     (ele) => {
//         return ele>30;
//     }
// )

// console.log(nums3);



// let products = ["Mobiles", "Laptops", "Tv", "Ac"];
// let products2 = products.filter((ele) => {
//     return ele.length > 2;
// })

// console.log(products);
// console.log(products2);





// let products = ["Mobiles", "Laptops", "Tv", "Ac", "Watch", "Washing Machine"];
// let products2 = products.filter((ele) => {
//     return ele[0].toLowerCase() === 'w';
// })

// console.log(products);
// console.log(products2);




// let nums = [10, 20, 30, 40, 50, 60];
// console.log(nums);

// let y = nums.filter(
//     (ele) =>{
//         return ele > 30;
//     }
// )
// console.log(y);

// let x = nums.filter(
//     (ele) =>{
//         return ele > 30;
//     }
// ).find(
//     (ele) =>{
//         return ele > 20;
//     }
// )
// console.log(x);

// let nums = [10, 20, 30, 40, 50, 60];
// console.log(nums);
// // reverse the array 
// let revnums = nums.reverse();
// console.log(revnums);


// // convert array to string
// let numsstr = nums.join();
// let numsstr1 = nums.join(" ");
// let numsstr2 = nums.join("-");
// let numsstr3 = nums.join("==");
// console.log(numsstr);
// console.log(numsstr1);
// console.log(numsstr2);
// console.log(numsstr3);


let str = "Java Script";

let x = str.split("");
console.log(x);

let y = x.reverse();
console.log(y);
let z = y.join("");
console.log(z);

let a = str.split("").reverse().join("");
console.log(a);





