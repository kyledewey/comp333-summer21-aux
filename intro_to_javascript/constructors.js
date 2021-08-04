function getAreaMethod() {
    return this.width * this.height;
}
let rectanglePrototype =
    { 'getArea': getAreaMethod };
function Rectangle(inputWidth, inputHeight) {
    this.width = inputWidth;
    this.height = inputHeight;
    this.__proto__ = rectanglePrototype;
}
