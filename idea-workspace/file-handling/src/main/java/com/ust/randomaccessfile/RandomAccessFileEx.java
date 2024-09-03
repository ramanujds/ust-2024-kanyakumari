package com.ust.randomaccessfile;


import java.io.*;
import java.util.Scanner;

public class RandomAccessFileEx {
    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(System.in);
                RandomAccessFile randomAccessFile = new RandomAccessFile("output.txt", "rw")) {

            do {
                System.out.println("1.Enter text to written : ");
                System.out.println("2.Read contents of file : ");
                System.out.println("Enter your choice : ");
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {
                    case 1:
                        System.out.println("Enter data to add: ");
                        String data = sc.nextLine();
                        randomAccessFile.writeUTF(data);
                        System.out.println("data added successfully to the file........");
                        break;
                    case 2:
                        randomAccessFile.seek(0);
                        String res;
                        long currentPos = randomAccessFile.getFilePointer();
                        long length = randomAccessFile.length()-"leWriter".length()-1;
                        // checks for end of file
                        while (currentPos< length) {
                            res = randomAccessFile.readUTF();
                            System.out.println(res);
                            currentPos = randomAccessFile.getFilePointer();

                        }
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            } while (true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

