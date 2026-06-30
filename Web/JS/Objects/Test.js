var a = 800;

function outerFuction() {
    a++;
    var a = 12;
    function innerFunction(){
        console.log(a++);
    }

    innerFunction();
}
outerFuction()
