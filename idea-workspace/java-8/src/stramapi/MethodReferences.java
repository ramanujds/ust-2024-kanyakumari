package stramapi;

import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {

        var list = List.of(10,20,30,40,50);



        list.forEach(i-> System.out.print(i+" "));

        list.forEach(System.out::println);

        List<String> names = List.of("Harsh","Karan","Lokesh","Mohit");

        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
