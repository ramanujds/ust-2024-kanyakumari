package lambdaexpression;


interface Printer{
    void print(String str);
    default void scan(){
    }
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Printer obj1 = s -> System.out.println(s);
        obj1.print("Hello Trivandrum");
    }


}
