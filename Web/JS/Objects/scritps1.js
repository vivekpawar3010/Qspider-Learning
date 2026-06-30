// let mobile = {
//     name:"iphone",
//     price:121212,
//     color:"black"
// }

// console.log(mobile);
// console.log(mobile.color);
// console.log(mobile.name);
// console.log(mobile.price);

// let mobile = {};

// mobile.price = 121212;
// mobile.name = "S26";
// mobile.color = "Black";

// console.log(mobile);
// console.log(mobile.color);
// console.log(mobile.name);
// console.log(mobile.price);


// let car = {
//     brand:"Ford Maverick",
//     model:" F-150",
//     price:121212,
//     topspeed:300
// }

// console.log(car);
// console.log(car.brand);
// console.log(car.model);
// console.log(car.price);
// console.log(car.topspeed);
// car.type = "Luxyru";
// console.log(car.type);
// delete car.brand;
// console.log(car.brand);

// let car = {
//     brand:"Ford Maverick",
//     model:" F-150",
//     price:121212,
//     colors:['green', 'red', 'yellow']
// }
// console.log(car);
// console.log(car.brand);
// console.log(car.model);
// console.log(car.price);
// console.log(car.colors);

// car.colors.forEach((ele) =>{
//     console.log(ele);
// });


// let car = {
//     brand:"Ford Maverick",
//     model:" F-150",
//     price:121212,
//     colors:['green', 'red', 'yellow'],
//     engin:{
//         capacity:"4l",
//         milage:"12kmpl",
//         type:['v6','v12', 'v8']
//     }
// }

// console.log(car);
// console.log(car.brand);
// console.log(car.engin);
// console.log(car.engin.capacity);
// console.log(car.engin.type);
// car.engin.type.forEach((ele) => {
//     console.log(ele);
// });


// let laptop = {
//     brand: "Apple MacBook",
//     model: "Pro M3",
//     price: 199900,
//     colors: ['space grey', 'silver', 'space black'],
//     processor: { 
//         capacity: "16GB RAM",
//         battrylife: "18 hours battery", 
//         type: ['M3', 'M3 Pro', 'M3 Max']
//     }
// }

// console.log(laptop);
// console.log(laptop.brand);
// console.log(laptop.engin);
// console.log(laptop.processor.capacity);
// console.log(laptop.processor.type);
// laptop.processor.type.forEach((ele) => {
//     console.log(ele);
// });


// let bike = {
//     brand: "Hero MotoCorp",
//     model: "Xpulse 200 4V",
//     price: 145000,
//     colors: ['matte grey', 'sports red', 'nexus blue'],
//     engin: { 
//         capacity: "200cc",
//         milage: "40kmpl",
//         type: ['oil cooled', 'single cylinder', '4-stroke']
//     }
// }

// console.log(bike);
// console.log(bike.brand);
// console.log(bike.engin);
// console.log(bike.engin.capacity);
// console.log(bike.engin.type);
// bike.engin.type.forEach((ele) => {
//     console.log(ele);
// });


//createting the object by taking 4the value form the user
  

// let submit = () => {
//     let name = document.getElementById("username");
//     let pass = document.getElementById("pass");


    
//     let obj = {
//         username: name,
//         password : pass

//     }; 
//     console.log(obj);
    
// }




let bike = {
    brand: "Hero MotoCorp",
    model: "Xpulse 200 4V",
    price: 145000,
    colors: ['matte grey', 'sports red', 'nexus blue'],
    engin: { 
        capacity: "200cc",
        milage: "40kmpl",
        type: ['oil cooled', 'single cylinder', '4-stroke']
    }
}

console.log(Object.keys(bike));
console.log(Object.keys(bike.engin)); // to get the     
console.log(Object.values(bike.engin)); // to get the     
console.log(Object.values(bike)); // to get the    

// Object.freeze(bike); // to restrict the udpationn of the object no delete,udpate, add

// bike.brand = "honda";
// bike.stock = 4;
// delete bike.colors;

// console.log(bike);
// console.log(Object.isFrozen(bike));



Object.seal(bike); // to restrict the udpationn of the object no udpate, add

bike.brand = "honda";
bike.stock = 4;
delete bike.colors;

console.log(bike);
console.log(Object.isSealed(bike));

