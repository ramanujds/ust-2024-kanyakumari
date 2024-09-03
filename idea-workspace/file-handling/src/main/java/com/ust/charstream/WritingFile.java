package com.ust.charstream;

import java.io.*;

public class WritingFile {

    public static void main(String[] args) {

        Writer output = null;
        try {
             output = new FileWriter("output.txt");

            String lines = """
                    Hello UST,
                    We are writing data on a file using FileWriter
                    """;

            output.append(lines);

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
