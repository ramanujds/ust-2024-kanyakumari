package com.ust;

public class Downloader{

    public void download(){
        for (int i=0; i<=100; i+=10){
            System.out.println("From "+Thread.currentThread().getName()+" Downloaded : "+i+"%");
            if (Thread.currentThread().getName().equalsIgnoreCase("Downloader1") && i==50){
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
//            try {
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException ex){
//                System.err.println(ex.getMessage());
//            }
        }
        System.out.println("Download Complete");
    }

}
