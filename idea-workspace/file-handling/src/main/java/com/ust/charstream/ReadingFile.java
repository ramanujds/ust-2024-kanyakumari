package com.ust.charstream;

import java.io.*;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) {

        try {
            Reader input = new FileReader("data.txt");

            BufferedReader reader = new BufferedReader(input);


            reader.lines().forEach(System.out::println);

        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }



    }

}
