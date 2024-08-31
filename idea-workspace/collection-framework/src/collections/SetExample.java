package collections;

import model.Trainee;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {

        var t1 = new Trainee(1, "Manya", "Telangana");
        var t2 = new Trainee(2, "Russel", "Tamilnadu");
        var t3 = new Trainee(3, "Joel", "Kerala");
        var t4 = new Trainee(4, "Srinivas", "Maharashtra");
        var t5 = new Trainee(5, "Akash", "Kerala");

        var trainees = List.of(t1, t2, t3, t4, t5);

        var mallus = trainees.stream()
                .map(Trainee::new)
                .toList();

        mallus.forEach(System.out::println);
        trainees.forEach(System.out::println);
    }

}




