package basicexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionExample {

    public static void main(String[] args) throws FileNotFoundException,RuntimeException {


        FileReader reader = new FileReader("hello.txt");
        Scanner scanner = new Scanner(reader);
        System.out.println(scanner.nextLine());


    }

}
