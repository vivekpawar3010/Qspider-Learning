// Q1. Extract "Script" from "JavaScript" and check whether it starts with "S".
let str1 = "JavaScript";
let result1 = str1.slice(4);
console.log(result1);
console.log(result1.startsWith("S"));


// Q2. Find the index of "World" in "Hello World" and extract it using slice().
let str2 = "Hello World";
let index2 = str2.indexOf("World");
console.log(index2);
console.log(str2.slice(index2));


// Q3. Check whether "Programming" includes "gram" and ends with "ing".
let str3 = "Programming";
console.log(str3.includes("gram"));
console.log(str3.endsWith("ing"));


// Q4. Extract the last 5 characters from "Developer" and convert them into a repeated string 3 times.
let str4 = "Developer";
let result4 = str4.slice(-5);
console.log(result4);
console.log(result4.repeat(3));


// Q5. Find the first and last occurrence of "a" in "JavaScript".
let str5 = "JavaScript";
console.log(str5.indexOf("a"));
console.log(str5.lastIndexOf("a"));


// Q6. Check whether "Frontend Developer" starts with "Front" and ends with "per".
let str6 = "Frontend Developer";
console.log(str6.startsWith("Front"));
console.log(str6.endsWith("per"));


// Q7. Extract the first 4 characters of "Programming" and check whether they include "ro".
let str7 = "Programming";
let result7 = str7.slice(0, 4);
console.log(result7);
console.log(result7.includes("ro"));


// Q8. Split "Java,Python,C++" and print the first language.
let str8 = "Java,Python,C++";
let arr8 = str8.split(",");
console.log(arr8[0]);


// Q9. Find the index of "Script" in "JavaScript" and extract it using substring().
let str9 = "JavaScript";
let index9 = str9.indexOf("Script");
console.log(index9);
console.log(str9.substring(index9));


// Q10. Take a string and check:
// starts with "A"
// ends with "Z"
// includes "Java"
let str10 = "AJavaZ";
console.log(str10.startsWith("A"));
console.log(str10.endsWith("Z"));
console.log(str10.includes("Java"));


// Q11. Extract the first and last character of a string using charAt().
let str11 = "JavaScript";
console.log(str11.charAt(0));
console.log(str11.charAt(str11.length - 1));


// Q12. Find the last occurrence of "o" in "Hello World" and extract everything after it.
let str12 = "Hello World";
let index12 = str12.lastIndexOf("o");
console.log(index12);
console.log(str12.slice(index12 + 1));


// Q13. Extract "Stack" from "Full Stack Developer" and check whether it ends with "ck".
let str13 = "Full Stack Developer";
let result13 = str13.slice(5, 10);
console.log(result13);
console.log(result13.endsWith("ck"));


// Q14. Repeat the first character of "JavaScript" 10 times.
let str14 = "JavaScript";
console.log(str14.charAt(0).repeat(10));


// Q15. Find the index of the first space in "Java Full Stack" and extract "Java".
let str15 = "Java Full Stack";
let index15 = str15.indexOf(" ");
console.log(index15);
console.log(str15.slice(0, index15));


// Q16. Extract the last word from "Java Full Stack Developer" using lastIndexOf() and slice().
let str16 = "Java Full Stack Developer";
let index16 = str16.lastIndexOf(" ");
console.log(str16.slice(index16 + 1));


// Q17. Check whether "Programming" contains "Pro" and starts with "P".
let str17 = "Programming";
console.log(str17.includes("Pro"));
console.log(str17.startsWith("P"));


// Q18. Split "HTML-CSS-JS" and print the last technology.
let str18 = "HTML-CSS-JS";
let arr18 = str18.split("-");
console.log(arr18[arr18.length - 1]);


// Q19. Extract "Developer" from "Java Developer" and check whether it includes "lop".
let str19 = "Java Developer";
let result19 = str19.slice(5);
console.log(result19);
console.log(result19.includes("lop"));


// Q20. Find the position of "Script" and verify that the extracted word starts with "S" and ends with "t".
let str20 = "JavaScript";
let index20 = str20.indexOf("Script");
let result20 = str20.slice(index20);
console.log(index20);
console.log(result20);
console.log(result20.startsWith("S"));
console.log(result20.endsWith("t"));



