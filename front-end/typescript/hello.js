var username = "John";
console.log(username);
// demonstrate each types in typescript
var isDone = false;
var decimal = 6;
var color = "blue";
var list = [1, 2, 3];
var list2 = [1, 2, 3];
// Tuple
var x;
x = ["hello", 10]; // OK
x = ["abc", 10]; // OK
x[0] = "world"; // OK
console.log(x); // OK
// Wrong type
// x = [10, "hello"]; 
// Error: Type 'number' is not assignable to type 'string'
// use cases of tuple
// When you want to store a fixed number of elements of different types.
// When you want to access the elements by index.
// When you want to ensure the order of the elements.
// When you want to pass a fixed-size array to a function.
// Enum
var Color;
(function (Color) {
    Color[Color["RED"] = 0] = "RED";
    Color[Color["GREEN"] = 1] = "GREEN";
    Color[Color["BLUE"] = 2] = "BLUE";
})(Color || (Color = {}));
;
var c = Color.GREEN;
console.log(Color);
// never type
function error(message) {
    throw new Error(message);
}
var value = "hello";
var value2;
console.log(value3);
