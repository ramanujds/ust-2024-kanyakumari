package com.ust.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) {
//        Trainee trainee = new Trainee(1, "John", "john@yahoo.com");
//        System.out.println("Before Serialization: " + trainee);

       try(
//           OutputStream outputStream = new FileOutputStream("trainee.ser");
//           ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

           InputStream inputStream = new FileInputStream("trainee.ser");
           ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
       ){
 //          objectOutputStream.writeObject(trainee);

           Trainee savedTrainee = (Trainee) objectInputStream.readObject();
           System.out.println("After Serialization: " + savedTrainee);



       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
      }
       catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }


    }
}
