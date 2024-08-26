package basicexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionExample {

    public static void main(String[] args)  {


        FileReader reader = null;
        try {
            reader = new FileReader("hello.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Scanner scanner = new Scanner(reader);
        System.out.println(scanner.nextLine());


    }

}
