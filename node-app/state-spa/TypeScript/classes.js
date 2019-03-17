class Point {
    constructor(x, y) {
        this._x = x;
        this._y = y;
    }
    get x() {
        return this._x;
    }
    get y() {
        return this._y;
    }
}
let point1 = new Point(10, 2);
console.log(point1.x);
console.log(point1.y);
