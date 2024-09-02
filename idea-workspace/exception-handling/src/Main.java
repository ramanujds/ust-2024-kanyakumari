public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Everyone..");
        System.out.println("We are doing some math operations : ");
        int a=10, b=0;
        System.out.println("Trying a division operation : ");
        if (b == 0) {
            System.err.println("Cannot divide by zero");
        } else {
            int divOutput = a / b;
            System.out.println("Result of Division : " + divOutput);
        }


        System.out.println("Trying a multiplication operation : ");
        int productOutput = a*b;
        System.out.println("Result of Multiplication "+productOutput);

        System.out.println("All Done");
        System.out.println("Bye...");


    }
}