package stramapi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = List.of("Harsh","Karan","Lokesh","Mohit");

        // sort in reverse order

        var sorted = list.stream().sorted((s1,s2)->s2.compareTo(s1)).toList();

        System.out.println(sorted);

        // find names starts with H or M

        var filtered = list.stream().filter(s->s.startsWith("H") || s.startsWith("M")).toList();

        System.out.println(filtered);

        // Return a single comma separated string containing all the names

        var str = list.stream().filter(s->s.startsWith("X") || s.startsWith("Y"))
                        .reduce((name,s)->name+","+s).orElse("None Found");

        System.out.println(str);


    }

}
