package com.ust.bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("data.txt");
            Scanner scanner = new Scanner(input);
//            int ch;
//            while ((ch=input.read())!=-1){
//                System.out.print((char) ch);
//            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }



    }

}
