package stackandqueue;

import java.util.List;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(5);
        stack.push(15);
        stack.push(20);

        while (!stack.isEmpty()){
            int item = stack.pop();
            System.out.println(item);
        }




    }

}
