package lambdaexpression;

import java.util.function.Consumer;

interface MathOperation {
    int doCalculate(int a, int b);
}


class Calculator {
    int calculate(int a, int b, MathOperation operation) {
        return operation.doCalculate(a, b);
    }
}

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.calculate(10, 5, (a, b) -> a + b);

        int product = calc.calculate(10, 5, (a, b) -> a * b);

        int largest = calc.calculate(20, 10, (a, b) -> a > b ? a : b);

        MathOperation findGCP = (a, b) -> {
            int g = 1;
            int larger = a > b ? a : b;
            for (int i = 1; i <= larger; i++) {
                if (a % i == 0 && b % i == 0) {
                    g = i;
                }
            }
            return g;
        };

        int gcp = calc.calculate(6, 4, findGCP);
        System.out.println(gcp);

    }
}
