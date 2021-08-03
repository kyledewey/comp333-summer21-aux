function getAreaMethod() {
    return this.width * this.height;
}

let rectanglePrototype =
    { 'getArea': getAreaMethod };

// constructors start with uppercase letters
function Rectangle(inputWidth, inputHeight) {
    // happens implicitly if called like new Rectangle(..., ...)
    // let this = {};
    
    this.width = inputWidth;
    this.height = inputHeight;
    this.__proto__ = rectanglePrototype;
    
    // this.getArea = function () {
    //     // when called as a method, this is bound to the object
    //     // you call it on
    //     // this: r1
    //     return this.width * this.height;
    // };
}
