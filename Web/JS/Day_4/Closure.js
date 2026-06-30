// let pf = () => {
//     let ae = 100;
//     let cf = () =>{
//         return ae++;
//     }
//     return cf;
// }
// let x = pf();
// console.log(x());
// console.log(x());
// console.log(x());
// console.log(x());
// console.log(x());
// console.log(x());
// console.log(x());




// let str = "akdjfasdkf";

// console.log(typeof str, str);


// let S = new String('adfasdfa');

// console.log(typeof S, S);


// let a = prompt("eere");


// let str = "Vivek";
// let revStr = "";

// for(let i = str.length - 1; i >= 0; i--){
//     revStr += str[i];
//     console.log(typeof revStr, revStr)
// }
// console.log(revStr);

console.log(str.charAt(1));

let str = "as soon as possible";
console.log(str.slice(3));
console.log(str.substring(3));
console.log("-----------------------------------------");

console.log(str.substring(-3));
console.log(str.slice(-3));
console.log("-----------------------------------------");
console.log(str.slice(3, 9));
console.log(str.substring(3, 9));
console.log("-----------------------------------------");
console.log(str.slice(-16, -10));
console.log(str.substring(-16, -10)); // consider 0 0 
console.log("-----------------------------------------");
console.log(str.slice(-19, 9));
console.log(str.substring(-19, 9));
console.log("-----------------------------------------");
console.log(str.slice(6, -19)); // empty not any output 
console.log(str.substring(6, -19)); // swap and give value








    
function submit() {
    let usernameInput = document.getElementById("username");
    let numberInput = document.getElementById("number");
    
    let name1 = usernameInput.value;
    let number = numberInput.value;
    
    console.log(typeof number, number);
    console.log(typeof name1, name1);
    
    let newname = "";
    for (let i = 0; i < 4; i++) {
        newname = newname + name1[i];
    }
    let newname1 = name1.slice(0, 4); 
    console.log("original name", name1); 
    console.log("by for loop", newname);
    console.log("by function", newname1);
    console.log(" ------------------------------------------------");

    let newnumber = "";
    for (let i = number.length - 1; i > number.length - 5; i--) {
        newnumber = number[i] + newnumber;
    }

    let newnumber1 = number.slice(-4); 

    console.log("original number", number);
    console.log("by for loop", newnumber);
    console.log("by function", newnumber1);
}
let a = 0;
if(8 == a) submit();