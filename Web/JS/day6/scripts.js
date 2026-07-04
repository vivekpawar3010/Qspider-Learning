
// let arr = [10, 20, 30, 40];
// let [a, b, c, d] = arr;
// console.log(a); // 10
// console.log(b); // 20
// console.log(c); // 30
// console.log(d); // 40

// let [a,,b] = arr;

// console.log(a);
// console.log(b);




// object desctrutirn e use the clerly brakets in it
// let obj = {
//     name:"Vivek",
//     phone:121212121,
// }

// let {name, phone} = obj;

// console.log(name); // Vivek
// console.log(phone); // 121212121


// rest  stroign the not desctrtre dvariable in hte on variable
// let arr = [10, 20, 30, 40, 50];
// let [a, b, ...c] = arr;
// console.log(a);
// console.log(b);
// console.log(c);


// let obj = {
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
//   };

//   let {name, director, rating, ...all} = obj;

// console.log(name);
// console.log(director);
// console.log(rating);
// console.log(all);


// spread = > it is the process user to seprate the array or object used to extract all the element at the single time

// let arr = [10, 20, 30, 40, 50];

// console.log(...arr);
// let arr1 = [...arr];
// console.log(arr1);  


// let obj = {
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
//   };

  
// let obj2 = {
//     name: "adfa",
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
//   };

// // console.log(...obj)
// let obj3 = {...obj, ...obj2};
// console.log(obj3);
