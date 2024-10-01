// adder.test.js
const add = require('./script'); 

test('adds 1 + 2 to equal 3', () => {
    expect(add(1, 2)).toBe(3); 
});

test('adds 5 + 7 to equal 12', () => {
    expect(add(5, 7)).toBe(12); 
});

// test('throws error when inputs are not numbers', () => {
//     expect(() => add('1', 2)).toThrow('Inputs must be numbers');
// });
