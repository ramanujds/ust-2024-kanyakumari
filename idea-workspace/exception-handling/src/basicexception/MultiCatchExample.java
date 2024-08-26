package basicexception;

public class MultiCatchExample {
    public static void main(String[] args) {

        int []arr = {2,3,0};

        try {
            int output = arr[0] / arr[2];
            System.out.println(output);
        }
        catch (ArithmeticException ex){
            System.err.println(ex);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex);
        }
        catch (Exception ex){
            System.err.println(ex);
        }



    }

}
