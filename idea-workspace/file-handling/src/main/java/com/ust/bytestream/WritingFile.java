package com.ust.bytestream;

import java.io.*;
import java.util.Scanner;

public class WritingFile {

    public static void main(String[] args) {

        OutputStream output = null;
        try {
             output = new FileOutputStream("output.txt");

            String lines = """
                    Hello all,
                    We are writing data on a file
                    """;

            output.write(lines.getBytes());

        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }
        finally {
            try {
                output.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }



    }

}
