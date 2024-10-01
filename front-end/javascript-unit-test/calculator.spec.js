const { add,subtract,divide,multiply } = require("./calculator");


test('adds 1 + 2 to equal 3', () => {
    expect(add(1, 2)).toBe(3); 
});

test('When a string is passed as an argument, it should throw an error', () => {
    expect(() => add('1', '2')).toThrow('Invalid input');
});


test('divides 10/2 to equal to 5',
    ()=> expect(divide(10,2)).toBe(5)
)
