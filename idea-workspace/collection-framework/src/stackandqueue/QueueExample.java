package stackandqueue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.offer("Javed");
        queue.offer("Rohan");
        queue.offer("Harsh");
        queue.offer("Taniya");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
