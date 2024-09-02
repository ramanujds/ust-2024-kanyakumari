package com.ust;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSync {

    Lock lock = new ReentrantLock();

    public void printScores(String player, List<Integer> scores) {
        lock.lock();
        System.out.println("Scores of " + player);
        scores.forEach(s -> System.out.println(s));
        lock.unlock();

    }

    public static void main(String[] args) {
        ThreadSync ts = new ThreadSync();
        List<Integer> sachinScores = List.of(85, 28, 44, 61, 30);
        List<Integer> viratScores = List.of(97, 106, 32, 88, 10);
        Thread t1 = new Thread(() -> ts.printScores("Sachin", sachinScores));
        Thread t2 = new Thread(() -> ts.printScores("Virat", viratScores));
        t1.start();
        t2.start();
    }


}
