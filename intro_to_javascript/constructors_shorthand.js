function Rectangle(inputWidth, inputHeight) {
    this.width = inputWidth;
    this.height = inputHeight;
}
Rectangle.prototype.getArea = function () {
    return this.width * this.height;
}
