package com.JavaAdvanced;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Counter counter = new Counter();
        for (int i=0; i<100; i++){
            executor.submit(() -> counter.increase());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(counter.getCounter());
    }

}

 class Counter {
    private int counter = 0;

    public void increase() {
        System.out.println("costam 1");
        System.out.println("costam 2");
        synchronized (this){
            counter = counter + 1;
        }

        System.out.println("costam 3");

    }

    public int getCounter() {
        return counter;
    }
}
