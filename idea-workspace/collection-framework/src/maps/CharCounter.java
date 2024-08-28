package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCounter {

    public static void main(String[] args) {

        String word = "Hello";

        word = word.toLowerCase();

        Map<Character,Integer> countMap = new TreeMap<>();

        char []arr = word.toCharArray();

        for (char ch:arr){
            if(countMap.containsKey(ch)){
                int count = countMap.get(ch);
                countMap.put(ch,++count);
            }
            else{
                countMap.put(ch,1);
            }
        }

        for (char ch:countMap.keySet()){
            System.out.println(ch+" -> "+countMap.get(ch));
        }

    }

}
