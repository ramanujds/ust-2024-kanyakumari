let add = (a, b) => {
    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new Error('Invalid input');
    }
    return a+b;
}

let subtract = (a, b) => {
    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new Error('Invalid input');
    }
    return a-b;
}

let multiply = (a, b) => {
    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new Error('Invalid input');
    }
    return a*b;
}

let divide = (a, b) => {
    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new Error('Invalid input');
    }
    if(b === 0){
        throw new Error("Cannot Divide by zero")
    }
    return a/b;
}

module.exports = {
    add,
    subtract,
    multiply,
    divide
}