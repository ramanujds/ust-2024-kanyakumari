package maps;

import model.Trainee;

import java.util.HashMap;
import java.util.Map;

public class MapOfTrainees {

    public static void main(String[] args) {

        Map<Integer, Trainee> traineeMap = new HashMap<>();

        Trainee t1 = new Trainee(1,"Manya","Telangana");
        Trainee t2 = new Trainee(2,"Russel","Tamilnadu");
        Trainee t3 = new Trainee(3,"Joel","Kerala");
        Trainee t4 = new Trainee(2,"Russel","Kerala");

        traineeMap.put(t1.getId(),t1);
        traineeMap.put(t2.getId(),t2);
        traineeMap.put(t3.getId(),t3);
        traineeMap.put(t4.getId(),t4);


        int id = 2;

        Trainee trainee = traineeMap.get(id);

        System.out.println(trainee);


    }
}
