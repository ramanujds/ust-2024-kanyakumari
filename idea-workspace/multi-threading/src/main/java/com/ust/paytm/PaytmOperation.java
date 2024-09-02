package com.ust.paytm;

import java.util.SortedMap;

public class PaytmOperation {

    public static void main(String[] args) throws InterruptedException {

        PaytmWallet wallet = new PaytmWallet(100);

        Thread payBillThread = new Thread(() -> wallet.payBill(1000));
        Thread addMoneyThread = new Thread(()-> wallet.addMoney(5000));

        payBillThread.start();
     //   payBillThread.join();
        addMoneyThread.start();


    }


}

class PaytmWallet {

    double balance;

    public PaytmWallet(double balance) {
        this.balance = balance;
    }

    synchronized void addMoney(double amount) {
        System.out.println("Adding amount to wallet");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance += amount;
        System.out.println("Amount added : "+amount);
        System.out.println("Current Balance : "+balance);
        notifyAll();

    }

    synchronized void payBill(double amount) {

        System.out.println("Processing the bill");
        if (amount > balance) {
            System.out.println("Insufficient Balance : "+balance);
            try {
                wait(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (amount>balance){
            System.out.println("Sorry please add the amount and try again later");
            return;
        }
        balance -= amount;
        System.out.println("Payment Successful");

        }


    }
