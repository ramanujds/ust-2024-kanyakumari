package collections;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Phone");
        items.add("Watch");
        items.add("Fridge");



        for (var item:items){
            System.out.println(item.toUpperCase());
        }



    }

}
