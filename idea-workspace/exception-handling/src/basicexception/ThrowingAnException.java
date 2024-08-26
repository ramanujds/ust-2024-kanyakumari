package basicexception;

import java.util.Scanner;

public class ThrowingAnException {


    public static int readAge() throws InvalidAgeException {

        System.out.println("Input your age: ");

        int age = new Scanner(System.in).nextInt();

        if (age <= 0 || age > 100) {
            throw new InvalidAgeException("Sorry Invalid Age");
        }
        return age;
    }

    public static void main(String[] args) {

        int age = 0;
        try {
            age = readAge();
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Age : " + age);

    }

}
