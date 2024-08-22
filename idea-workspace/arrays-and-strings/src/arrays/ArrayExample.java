package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {

        int []arr = new int[10];

        Random rand = new Random();

        for(int i=0; i<arr.length; i++){
            arr[i]=rand.nextInt(90)+10;
        }

        System.out.println("Before Sorting");
        for (int value:arr){
            System.out.print(value+"\t");
        }

        Arrays.sort(arr);

        System.out.println();
        System.out.println("After Sorting");
        for (int value:arr){
            System.out.print(value+"\t");
        }

    }

}
