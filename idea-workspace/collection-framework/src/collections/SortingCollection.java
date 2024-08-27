package collections;

import model.Trainee;

import java.util.*;

public class SortingCollection {

    public static void main(String[] args) {

        Trainee t1 = new Trainee(1,"Manya","Telangana");
        Trainee t2 = new Trainee(2,"Russel","Tamilnadu");
        Trainee t3 = new Trainee(3,"Joel","Kerala");
        Trainee t4 = new Trainee(4,"Akash","Kerala");

        List<Trainee> list = new ArrayList<>(List.of(t1,t2,t3,t4));

//        list.stream().sorted().forEach(System.out::println);

        Collections.sort(list);
        list.forEach(System.out::println);

//        Set<Trainee> set = new TreeSet<>(List.of(t1,t2,t3));
//
//
//        set.forEach(System.out::println);


    }

}
