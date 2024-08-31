package stackandqueue;

import model.Status;
import model.Task;

import java.util.*;

public class ToDoApp {

    private Queue<Task> taskQueue = new PriorityQueue<>(
            (t1,t2)->t2.getPriority()-t1.getPriority()
    );
    private Stack<Task> completedTasks = new Stack<>();


    public void addTask(){
        taskQueue.offer(new Task("Learn Java",5, Status.PENDING));
        taskQueue.offer(new Task("Learn Python",4, Status.PENDING));
        taskQueue.offer(new Task("Learn Swimming",2, Status.PENDING));
        taskQueue.offer(new Task("Join Gym",4, Status.PENDING));
    }

    public void processTasks(){
        while (!taskQueue.isEmpty()){
            Task currentTask = taskQueue.poll();
            currentTask.setStatus(Status.COMPLETED);
            System.out.println(currentTask.getTitle()+ " : Completed");
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
