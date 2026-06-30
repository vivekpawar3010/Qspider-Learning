// Q1. Extract "Code" from "LearnCode" and check whether it starts with "C".

let str1 = "LearnCode";
let result1 = str1.slice(5);

console.log(result1);            // Code
console.log(result1.startsWith("C")); // true


// Q2. Find the index of "Book" in "Read Book" and extract it using slice().

let str2 = "Read Book";
let index2 = str2.indexOf("Book");

console.log(index2);             // 5
console.log(str2.slice(index2)); // Book


// Q3. Check whether "Education" includes "cat" and ends with "ion".

let str3 = "Education";

console.log(str3.includes("cat")); // true
console.log(str3.endsWith("ion")); // true


// Q4. Extract the last 4 characters from "Engineer" and repeat them 2 times.

let str4 = "Engineer";
let result4 = str4.slice(-4);

console.log(result4);           // neer
console.log(result4.repeat(2)); // neerneer


// Q5. Find the first and last occurrence of "o" in "Google".

let str5 = "Google";

console.log(str5.indexOf("o"));     // 1
console.log(str5.lastIndexOf("o")); // 2


// Q6. Check whether "Backend Developer" starts with "Back" and ends with "per".

let str6 = "Backend Developer";

console.log(str6.startsWith("Back")); // true
console.log(str6.endsWith("per"));    // true


// Q7. Extract the first 5 characters of "JavaScript" and check whether they include "ava".

let str7 = "JavaScript";
let result7 = str7.slice(0, 5);

console.log(result7);                // JavaS
console.log(result7.includes("ava")); // true


// Q8. Split "Java,Python,C++,PHP" and print the last language.

let str8 = "Java,Python,C++,PHP";
let arr8 = str8.split(",");

console.log(arr8[arr8.length - 1]); // PHP


// Q9. Find the index of "World" in "HelloWorld" and extract it using substring().

let str9 = "HelloWorld";
let index9 = str9.indexOf("World");

console.log(index9);                // 5
console.log(str9.substring(index9)); // World


// Q10. Take a string and check:
// starts with "M"
// ends with "N"
// includes "Java"

let str10 = "MJavaN";

console.log(str10.startsWith("M")); // true
console.log(str10.endsWith("N"));   // true
console.log(str10.includes("Java"));// true


// Q11. Extract the first and last character of "Programming" using charAt().

let str11 = "Programming";

console.log(str11.charAt(0));                // P
console.log(str11.charAt(str11.length - 1)); // g


// Q12. Find the last occurrence of "e" in "Experience" and extract everything after it.

let str12 = "Experience";
let index12 = str12.lastIndexOf("e");

console.log(index12);             // 9
console.log(str12.slice(index12 + 1)); // ""


// Q13. Extract "Design" from "Web Design Course" and check whether it ends with "gn".

let str13 = "Web Design Course";
let result13 = str13.slice(4, 10);

console.log(result13);           // Design
console.log(result13.endsWith("gn")); // true


// Q14. Repeat the first character of "Developer" 8 times.

let str14 = "Developer";

console.log(str14.charAt(0).repeat(8)); // DDDDDDDD


// Q15. Find the index of the first space in "Data Science Course" and extract "Data".

let str15 = "Data Science Course";
let index15 = str15.indexOf(" ");

console.log(index15);              // 4
console.log(str15.slice(0, index15)); // Data


// Q16. Extract the last word from "Full Stack Developer" using lastIndexOf() and slice().

let str16 = "Full Stack Developer";
let index16 = str16.lastIndexOf(" ");

console.log(str16.slice(index16 + 1)); // Developer


// Q17. Check whether "Technology" contains "Tech" and starts with "T".

let str17 = "Technology";

console.log(str17.includes("Tech")); // true
console.log(str17.startsWith("T"));  // true


// Q18. Split "React-Node-MongoDB" and print the last technology.

let str18 = "React-Node-MongoDB";
let arr18 = str18.split("-");

console.log(arr18[arr18.length - 1]); // MongoDB


// Q19. Extract "Manager" from "Project Manager" and check whether it includes "age".

let str19 = "Project Manager";
let result19 = str19.slice(8);

console.log(result19);                // Manager
console.log(result19.includes("age")); // true


// Q20. Find the position of "Code" and verify that the extracted word starts with "C" and ends with "e".

let str20 = "LearnCode";
let index20 = str20.indexOf("Code");
let result20 = str20.slice(index20);

console.log(index20);              // 5
console.log(result20);             // Code
console.log(result20.startsWith("C")); // true
console.log(result20.endsWith("e"));   // true