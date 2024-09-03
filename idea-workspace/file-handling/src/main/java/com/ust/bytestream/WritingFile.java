package com.ust.bytestream;

import java.io.*;
import java.util.Scanner;

public class WritingFile {

    public static void main(String[] args) {


        try(OutputStream output = new FileOutputStream("output.txt") ) {
            String lines = """
                    Hello all,
                    We are writing data on a file
                    """;
            output.write(lines.getBytes());

        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }




    }

}
