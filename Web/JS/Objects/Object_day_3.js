let mobile1 = {
    name : "Redmi",

}
console.log(mobile1);

let mobile2 = {
    price:2000,
    color: ["red", "black", "blue"],
}
console.log(mobile2);

let mergeMobile = Object.assign({}, mobile1, mobile2);
console.log(mergeMobile);
mobile1.name = "Samsong";
mobile1.color.push("white")
console.log(mergeMobile);
console.log(mobile1);
