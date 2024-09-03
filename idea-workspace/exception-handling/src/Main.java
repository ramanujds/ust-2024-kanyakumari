public class Main {
    public static void main(String[] args) {

        System.out.println("Hey dudes..");
        System.out.println("We are doing some math operations : ");
        int a=10, b=0;

        try {
            System.out.println("Division operation : ");
            int divOutput = a / b;
            System.out.println("Result of Division : " + divOutput);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Multiplication operation : ");
        int productOutput = a*b;
        System.out.println("Result of Multiplication :"+productOutput);

        System.out.println("All Done");
        System.out.println("Bye...");

    }
}