// console.log(this);

// let laptop = {
//     brand:"hi",
//     price:121212,
//     // display: function() {
//     display: () => {
//         console.log(this); // arrow function allways refere to the window objects.
//         console.log("The brand is ", this.brand);
        
//     }

// }


// laptop.display();


// let student = {
//     name:"king",
//     mobile:1212121212,
//     // display : function() {
//     //     console.log(`Student Name is ${this.display} and mobile is ${this.mobile}`);
//     // }
// }

// // student.display();
// let student1 = {
//     name:"king",
//     mobile:1212121212,
//     // display : function() {
//     //     console.log(`Student Name is ${this.display} and mobile is ${this.mobile}`);
//     // }
// }

// // student1.display();


// // creating teh same mathed to disply info in the objects

// function details(a = "NA") {
//     console.log(`Student Name is ${this.name} and mobile is ${this.mobile} his age is ${a}`);
// }
// // details.call(student,21);
// // details.call(student1,21);



// // details.apply(student, [121212, "BE"])
// // details.apply(student1,[123313,4,134,1234,1,34,123,414  ]);


// let a = details.bind(student, [121212, "BE"])
// let b = details.bind(student1,[123313,4,134,1234,1,34,123,414  ]);


// a();
// b();




//create the emp object 

// let employ = {
//     name:"Vivek",
//     sal:700000,
// }

// console.log(employ);


// let employ2 = {
//     name:"King",
//     sal:700000,
// }
// console.log(employ2);


// let employ3 = {
//     name:"Chatanya",
//     sal:700000,
// }
// console.log(employ3);


// let employ4 = {
//     name:"Ritu",
//     sal:700000,
// }
// console.log(employ4);


// let employ5 = {
//     name:"Suyash",
//     sal:700000,
// }
// console.log(employ5);



// function totalSal(bonus = 10000){
//     console.log(`Hi ${this.name} your current sal is ${this.sal} and your bonus is ${bonus}`)
// }

// totalSal.call(employ, 12000);
// totalSal.call(employ2, 12000);
// totalSal.call(employ3, 12000);
// totalSal.call(employ4, 12000);
// totalSal.call(employ5, 12000);


// totalSal.apply(employ, [12000]);
// totalSal.apply(employ2, [12000]);
// totalSal.apply(employ3, [12000]);
// totalSal.apply(employ4, [12000]);
// totalSal.apply(employ5, [12000]);



// let a1 = totalSal.bind(employ, [12000]);
// let a2 = totalSal.bind(employ2, [12000]);
// let a3 = totalSal.bind(employ3, [12000]);
// let a4 = totalSal.bind(employ4, [12000]);
// let a5 = totalSal.bind(employ5, [12000]);

// a1();
// a2();
// a3();
// a4();
// // a5();


// let objArr = [
//     {
//     name:"Vivek",
//     mobile:9890909890,
//     degree:"B. Tech in CSE",

//     },{
//         name:"King",
//         mobile:9890909890,
//         degree:"B. Tech in CSE",

//     },{
//         name:"Raju",
//         mobile:9890909890,
//         degree:"B. Tech in CSE",

//     },{
//         name:"Kaju",
//         mobile:9890909890,
//         degree:"B. Tech in CSE",

//     },{
//         name:"Kaka",
//         mobile:9890909890,
//         degree:"B. Tech in CSE",

//     }
// ]


// objArr.forEach( (ele) =>{
//     console.log(`The student name is ${ele.name} having moile number ${ele.mobile} having the degree in ${ele.degree}`);
    
// })


// const movies = [
//   {
//     name: "Dhadak",
//     director: "Shashank Khaitan",
//     rating: 2,
//     languages: ["Hindi"],
//     genre: ["Romantic", "Drama"],
//     cast: {
//       hero: "Ishaan Khatter",
//       heroine: ["Janhvi Kapoor"],
//       villain: "Ashutosh Rana"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "Pushpa",
//     director: "Sukumar",
//     rating: 5,
//     languages: ["Telugu", "Hindi"],
//     genre: ["Action", "Drama"],
//     cast: {
//       hero: "Allu Arjun",
//       heroine: ["Rashmika Mandanna"],
//       villain: "Fahadh Faasil"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "KGF Chapter 1",
//     director: "Prashanth Neel",
//     rating: 5,
//     languages: ["Kannada", "Hindi"],
//     genre: ["Action", "Drama"],
//     cast: {
//       hero: "Yash",
//       heroine: ["Srinidhi Shetty"],
//       villain: "Garuda"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "RRR",
//     director: "S. S. Rajamouli",
//     rating: 5,
//     languages: ["Telugu", "Hindi"],
//     genre: ["Action", "Drama", "Historical"],
//     cast: {
//       hero: "Ram Charan",
//       heroine: ["Alia Bhatt", "Olivia Morris"],
//       villain: "Ray Stevenson"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "Pathaan",
//     director: "Siddharth Anand",
//     rating: 4,
//     languages: ["Hindi"],
//     genre: ["Action", "Thriller"],
//     cast: {
//       hero: "Shah Rukh Khan",
//       heroine: ["Deepika Padukone"],
//       villain: "John Abraham"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "Jawan",
//     director: "Atlee",
//     rating: 5,
//     languages: ["Hindi", "Tamil"],
//     genre: ["Action", "Thriller"],
//     cast: {
//       hero: "Shah Rukh Khan",
//       heroine: ["Nayanthara"],
//       villain: "Vijay Sethupathi"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "Animal",
//     director: "Sandeep Reddy Vanga",
//     rating: 4,
//     languages: ["Hindi"],
//     genre: ["Action", "Crime", "Drama"],
//     cast: {
//       hero: "Ranbir Kapoor",
//       heroine: ["Rashmika Mandanna"],
//       villain: "Bobby Deol"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "3 Idiots",
//     director: "Rajkumar Hirani",
//     rating: 5,
//     languages: ["Hindi"],
//     genre: ["Comedy", "Drama"],
//     cast: {
//       hero: "Aamir Khan",
//       heroine: ["Kareena Kapoor"],
//       villain: "Virus"
//     },
//     ottAvailable: true,
//     country: "India"
//   },

//   {
//     name: "Bahubali: The Beginning",
//     director: "S. S. Rajamouli",
//     rating: 5,
//     languages: ["Telugu", "Hindi"],
//     genre: ["Action", "Fantasy", "Drama"],
//     cast: {
//       hero: "Prabhas",
//       heroine: ["Tamannaah Bhatia"],
//       villain: "Rana Daggubati"
//     },
//     ottAvailable: false,
//     country: "India"
//   },

//   {
//     name: "Kabir Singh",
//     director: "Sandeep Reddy Vanga",
//     rating: 4,
//     languages: ["Hindi"],
//     genre: ["Romantic", "Drama"],
//     cast: {
//       hero: "Shahid Kapoor",
//       heroine: ["Kiara Advani"],
//       villain: "None"
//     },
//     ottAvailable: false,
//     country: "India"
//   }
// ];



// movies.forEach(m => console.log(`${m.name} (${m.rating}⭐, ${m.country}) | Director: ${m.director} | Genres: ${m.genre.join(", ")} | Languages: ${m.languages.join(", ")} | Cast: Hero - ${m.cast.hero}, Heroine - ${m.cast.heroine.join(" & ")}, Villain - ${m.cast.villain} | OTT: ${m.ottAvailable ? "Yes" : "No"}`));

// let lessrating = [];


// let x = movies.filter((ele) =>{
//     return ele.rating < 5;
// })

// console.log(x);

// let y = movies.filter((ele) =>{
//     return ele.ottAvailable = false;
// })

// console.log(y);




// let y = movies.filter((ele) =>{
//     return ele.languages = ;
// })

// console.log(y);



// merging the object in one part 

// let obj1 = {
//   name:"obj1",
// }
// console.log(obj1);

// let obj2 = {
//   mobile:"1212121212",
// }
// console.log(obj2);

// let obj3 = {
//   address:"pune"
// }
// console.log(obj3);


// Object.assign(obj1, obj2, obj3);
// console.log(obj1);

// let obj4 = Object.assign({}, obj1, obj2, obj3);
// console.log(obj4);  


let obj1 = {
  name:"obj1",
  mobile:"1212121212",

}
console.log(obj1);

let obj2 = {
  mobile:"1212121212",
  skills:["html", 'css'],
}
console.log(obj2);



Object.assign(obj1, obj2);
console.log(obj1);

let objcopy = obj1.
