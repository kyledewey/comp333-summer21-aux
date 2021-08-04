function AddThis(x) {
    this.x = x;
}
AddThis.prototype.add = function (y) {
    return this.x + y;
}
