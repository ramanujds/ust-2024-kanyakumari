### Steps for Writing Unit Tests

1. **Choose a Testing Framework:**
   - **Jest**: Simple to set up, often used with React but works well with any JavaScript project.
   - **Mocha + Chai**: Mocha is a flexible test framework, while Chai provides assertion styles.

2. **Write a Function to Test**: 

   ```javascript
   // adder.js
   function add(a, b) {
       if (typeof a !== 'number' || typeof b !== 'number') {
           throw new Error('Inputs must be numbers');
       }
       return a + b;
   }

   module.exports = add;
   ```

3. **Create Test Files**: 
   If you're using **Jest**, you can put your test files under a folder like `__tests__` or name the test file with a `.test.js` or `.spec.js` suffix.


4. **Write Unit Tests**: 
  
   - **Install Jest**:
     ```bash
     npm i --save-dev @types/jest
     ```

   - **Write the Test**: Create a test file, e.g., `adder.test.js`.

   ```javascript
   // adder.test.js
   const add = require('../adder'); // Import the function to test

   test('adds 1 + 2 to equal 3', () => {
       expect(add(1, 2)).toBe(3); // Test if add(1, 2) equals 3
   });

   test('adds 5 + 7 to equal 12', () => {
       expect(add(5, 7)).toBe(12); // Test if add(5, 7) equals 12
   });

   test('throws error when inputs are not numbers', () => {
       expect(() => add('1', 2)).toThrow('Inputs must be numbers');
   });
   ```

5. **Run the Test**:
   - Add a script to `package.json` to run Jest:
     ```json
     "scripts": {
       "test": "jest"
     }
     ```

   - Run the test:
     ```bash
     npm test
     ```
   

### Example with Mocha + Chai

If you prefer **Mocha** and **Chai**, here's how you can write similar tests:

- **Install Mocha and Chai**:
  ```bash
  npm install --save-dev mocha chai
  ```

- **Write the Test**:
  ```javascript
  // adder.test.js
  const { expect } = require('chai');
  const add = require('../adder');

  describe('add function', () => {
      it('should add 1 + 2 to equal 3', () => {
          expect(add(1, 2)).to.equal(3);
      });

      it('should add 5 + 7 to equal 12', () => {
          expect(add(5, 7)).to.equal(12);
      });

      it('should throw error when inputs are not numbers', () => {
          expect(() => add('1', 2)).to.throw('Inputs must be numbers');
      });
  });
  ```

- **Run Mocha**:
  ```bash
  ./node_modules/.bin/mocha
  ```

### Summary
1. Pick a testing framework (e.g., Jest or Mocha + Chai).
2. Write a function that you want to test.
3. Write test cases to check the expected outcomes.
4. Run the tests and check the output.

