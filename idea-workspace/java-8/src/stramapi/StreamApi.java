package stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApi {

    public static List<Integer> getEvens(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        list.forEach(i -> {
            if (i % 2 == 0) {
                evens.add(i);
            }
        });
        return evens;
    }

    public static List<Integer> getSquares(List<Integer> list) {
        List<Integer> squares = new ArrayList<>();
        list.forEach(i -> {
            squares.add(i * i);
        });
        return squares;
    }

    static int getSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random(100);
        for (int i=0; i<100000; i++){
            list.add(random.nextInt());
        }


        var stream = list.stream();

        var parallelStream = list.parallelStream();

//        System.out.println(fe);

        var beforeStream = System.currentTimeMillis();

        var result1 = stream.map(i->i*i).reduce(0, Integer::sum);

        var afterStream = System.currentTimeMillis();

        var differenceStream = (afterStream-beforeStream)/10.0;


        var beforeParallelStream = System.currentTimeMillis();

        var result2 = parallelStream.map(i->i*i).reduce(0, Integer::sum);

        var afterParallelStream = System.currentTimeMillis();

        var differenceParallelStream = (afterParallelStream-beforeParallelStream)/10.0;

        System.out.println("Stream took "+differenceStream+" secs");
        System.out.println("Parallel Stream took "+differenceParallelStream+" secs");

        System.out.println(result1);
        System.out.println(result2);

    }

}
