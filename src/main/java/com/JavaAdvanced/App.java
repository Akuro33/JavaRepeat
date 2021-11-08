package com.JavaAdvanced;

import java.time.Period;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Główny Wątek aplikacji: " + Thread.currentThread().getName());

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        Runnable worker1 = () -> {
            try {
                System.out.println("Robotnik 1 - Aktualny wątek: " + Thread.currentThread().getName());
                System.out.println("Ładuje butle z tlenem");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Zaladowano Butle z Tlenem");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable worker2 = () -> {
            try {
                System.out.println("Robotnik 2 - Aktualny wątek: " + Thread.currentThread().getName());
                System.out.println("Ładuje zapas pożywienia");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Załadowano Pożywienie");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable worker3 = () -> {
            try {
                System.out.println("Robotnik 3 - Aktualny wątek: " + Thread.currentThread().getName());
                System.out.println("Ładuje paliwo");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Załadowano Paliwo");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        executorService.schedule(worker1, 5, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(worker3, 0, 6, TimeUnit.SECONDS);




     //   executorService.shutdown();
    }
}
