### Steps for Writing Unit Tests

1. **Choose a Testing Framework:**
   - **Jest**: Simple to set up, often used with React but works well with any JavaScript project.
   - **Mocha + Chai**: Mocha is a flexible test framework, while Chai provides assertion styles.

2. **Write a Function to Test**: 
   Let’s assume we want to test a function that adds two numbers.

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

   ```bash
   mkdir __tests__
   ```

4. **Write Unit Tests**: 
   Below is an example using **Jest**.

   - **Install Jest**:
     ```bash
     npm install --save-dev jest
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

6. **Check Test Output**: 
   Jest will run all the tests and report success or failure. The output might look like this:

   ```bash
   PASS  __tests__/adder.test.js
     ✓ adds 1 + 2 to equal 3 (5ms)
     ✓ adds 5 + 7 to equal 12 (1ms)
     ✓ throws error when inputs are not numbers (2ms)

   Test Suites: 1 passed, 1 total
   Tests:       3 passed, 3 total
   ```

### Key Considerations
- **Test edge cases**: Ensure you cover different scenarios like invalid inputs, edge values (e.g., very large numbers, negative numbers), and more.
- **Isolate dependencies**: If your function relies on external dependencies (e.g., database or API calls), mock those dependencies to isolate the unit under test.
- **Follow a descriptive test structure**: Use `describe` blocks for grouping related tests and make your test names descriptive enough so they explain what is being tested.

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

