package com.JavaAdvanced;

import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Główny Wątek aplikacji: " + Thread.currentThread().getName());
        Thread thread = new MyThread("My-Thread-1");
        Thread secondThread = new MyThread("My-Thread-2");

        thread.start();
        Runnable countDown = () -> {
            try {
                System.out.println("Wykonywany Wątek Runnable: " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable blastOff = () -> {
            System.out.println("Wykonywany Wątek Runnable: " + Thread.currentThread().getName());
            System.out.println("Blast Off!");
        };

        Thread countDownThread = new Thread(countDown, "CountDowns");
        Thread blastOfThread = new Thread(blastOff, "BlastOff");
        countDownThread.start();

        countDownThread.join(400);
        blastOfThread.start();

    }
}
