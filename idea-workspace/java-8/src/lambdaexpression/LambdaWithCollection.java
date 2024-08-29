package lambdaexpression;

import java.util.List;

public class LambdaWithCollection {

    public static void main(String[] args) {

        List<Integer> list = List.of(10,20,30,60,55,88);

        list.forEach(value-> System.out.println(value));


    }

}
