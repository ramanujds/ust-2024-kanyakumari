package maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");


//        System.out.println(map.get(1));

        for(int key:map.keySet()){
            System.out.println(key+ " - "+map.get(key));
        }



    }

}
