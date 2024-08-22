package arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int [][]arr= new int[][]{{4,7,8},{8,2,9},{6,3,1}};

//        for (int []rows:arr){
//            for (int value:rows){
//                System.out.print(value+"\t");
//            }
//            System.out.println();
//        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }



    }

}
