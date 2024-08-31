package stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApi {

    public static List<Integer> getEvens(List<Integer> list){
        List<Integer> evens = new ArrayList<>();
        list.forEach(i->{
            if(i%2==0){
                evens.add(i);
            }
        });
        return evens;
    }

    public static List<Integer> getSquares(List<Integer> list){
        List<Integer> squares = new ArrayList<>();
        list.forEach(i->{
            squares.add(i*i);
        });
        return squares;
    }

    static int getSum(List<Integer> list){
        int sum = 0;
        for (int num:list){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1,3,4,5,7,9);

        int fe = 0;
        for (int i:list){
            if (i%2==0){
               fe=i*i;
               break;
            }
        }

        System.out.println(fe);

       var fistEven = list.stream()
               .peek(i-> System.out.println("Filtered "+i))
               .filter(i->i%2==0)
               .map(i-> i*i)
               .peek(i-> System.out.println("Mapped " + i))
               .reduce((i,sum)->i+sum).orElseThrow(()->new ArithmeticException("No Even Element"));

        System.out.println(fistEven);




    }

}
