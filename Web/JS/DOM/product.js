let productList = [];
let productsContianer = document.getElementById("productsContianer");


let distplayProduct = (products) => {
    console.log(products);

    // products.forEach(element => {
    //     console.log(element.title);
    //     // let tag = document.createElement("p");
    //     // tag.innerText = element.title;
    //     productsContianer.innerHTML += `<p>${element.title}</p>`;
    //     // productsContianer.appendChild(tag);
    // });
    productsContianer.innerHTML = products.map( (product) => {
        return (
            `<div class = "card" >
            <p class="title" >${product.title}</p>
            <img class="img" src="${product.thumbnail}" alt="${product.title}">
            
            <p class="info">${product.description}</p>
            <p class="price"> $$${product.price}</p>
            <p class="rating" > ${"🩵".repeat(product.rating)} ${"🖤".repeat(5-Math.trunc(product.rating))} </p>
            <button class="cart-btn" > Add To Cart </button>
            </div>`
        );
    }).join('');
};

let lessThan500 = () =>{
    let filterProduct = productList.filter( (ele) => {
        return ele.price * 95 < 500;
    });
    distplayProduct(filterProduct);
}

let fetchProducts = async () => {
    let productsAPI = await fetch("https://dummyjson.com/products");
    let data = await productsAPI.json();
    productList = data.products;
    distplayProduct(data.products);
    console.log(data.products);
    
    
};

fetchProducts();
