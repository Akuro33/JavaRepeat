package com.JavaAdvanced;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Główny Wątek aplikacji: " + Thread.currentThread().getName());

        ExecutorService executorService = Executors.newSingleThreadExecutor();

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
            System.out.println("Wykonywany Wątek (BlastOff): " + Thread.currentThread().getName());
            System.out.println("Blast Off!");
        };
        executorService.submit(countDown);
        executorService.submit(blastOff);

        executorService.shutdown();


    }
}
