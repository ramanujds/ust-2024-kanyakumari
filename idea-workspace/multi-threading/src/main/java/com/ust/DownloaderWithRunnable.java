package com.ust;

public class DownloaderWithRunnable implements Runnable{

    @Override
    public void run() {
        download();
    }

    public void download(){
        for (int i=0; i<=100; i+=10){
            System.out.println("From "+Thread.currentThread().getName()+" Downloaded : "+i+"%");
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
