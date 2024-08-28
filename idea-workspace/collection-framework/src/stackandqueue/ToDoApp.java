package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ToDoApp {

    private Queue<String> taskQueue = new LinkedList<>();
    private Stack<String> completedTasks = new Stack<>();


    public void addTask(){
        taskQueue.offer("Learn Java");
        taskQueue.offer("Learn Python");
        taskQueue.offer("Learn Swimming");
        taskQueue.offer("Join Gym");
    }

    public void processTasks(){
        while (!taskQueue.isEmpty()){
            String currentTask = taskQueue.poll();
            System.out.println(currentTask+ " : Completed");
            completedTasks.push(currentTask);
        }

    }


    public void displayPastCompletedTasks(){
        while (!completedTasks.isEmpty()){
            System.out.println(completedTasks.pop());
        }
    }

    public static void main(String[] args) {

        ToDoApp myTodos = new ToDoApp();

        myTodos.addTask();

        myTodos.processTasks();

        myTodos.displayPastCompletedTasks();

    }


}
