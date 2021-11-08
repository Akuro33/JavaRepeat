package com.JavaAdvanced;

import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {
        System.out.println("Główny Wątek aplikacji: " + Thread.currentThread().getName());
        Thread thread = new MyThread("My-Thread-1");
        Thread secondThread = new MyThread("My-Thread-2");

        thread.start();
        Runnable runnable = () -> {
            try {
                System.out.println("Wykonywany Wątek Runnable: " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread anotherThread = new Thread(runnable, "My-Runnable-1");
        anotherThread.start();

    }
}
