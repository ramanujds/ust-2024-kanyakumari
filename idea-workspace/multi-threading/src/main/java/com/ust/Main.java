package com.ust;

public class Main {
    public static void main(String[] args) {


        Downloader task = new Downloader();

       Thread downloader1 = new Thread(()-> task.download());
       Thread downloader2 = new Thread(()->task.download());

        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");
//        downloader2.setPriority(Thread.MAX_PRIORITY);
//        downloader1.setPriority(Thread.MIN_PRIORITY);

        downloader1.start();
        downloader2.start();
    }
}