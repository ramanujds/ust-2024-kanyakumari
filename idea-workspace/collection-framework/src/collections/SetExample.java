package collections;

import model.Trainee;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

//        Set<String> set = new TreeSet<>(List.of("Abc","Pqr","123","Xyz","Xyz"));
//
//        for (String str:set){
//            System.out.println(str);
//        }

        Set<Trainee> trainees = new HashSet<>();

        Trainee t1 = new Trainee(1,"Manya","Telangana");
        Trainee t2 = new Trainee(2,"Russel","Tamilnadu");
        Trainee t3 = new Trainee(3,"Joel","Kerala");
        Trainee t4 = new Trainee(3,"Joel","Kerala");

        trainees.add(t1);
        trainees.add(t2);
        trainees.add(t3);
        trainees.add(t4);

        for (Trainee t:trainees){
            System.out.println(t);
        }






    }

}
