package com.ust;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceWithThreadsExample {
    public static void main(String[] args) {

        // Create an ExecutorService with a fixed thread pool of multiple threads

        int processorCount = Runtime.getRuntime().availableProcessors();

        ExecutorService executorService = Executors.newFixedThreadPool(processorCount);

        // Submit tasks to the ExecutorService
        for (int i = 1; i <= processorCount; i++) {
            MyTask task = new MyTask(i);
            executorService.submit(task);
        }

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}
