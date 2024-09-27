let username:string = "John";

console.log(username);

// demonstrate each types in typescript
let isDone:boolean = false;
let decimal: number = 6;
let color: string = "blue";
let list: number[] = [1, 2, 3];

let list2: Array<number> = [1, 2, 3];

// Tuple
let x: [string, number];

x = ["hello", 10]; // OK

x = ["abc", 10]; // OK

x[0]= "world"; // OK

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
enum Color {RED, GREEN, BLUE};

let c: Color = Color.GREEN;

console.log(Color);



// never type

function error(message: string): never {
    throw new Error(message);
}

let value : string|number = "hello";
 
 let value2:number ;

// types in function

function add(x:number,y?:number):number{
    if(y){
        return x+y;
    }
    return x;
}

add(2)

