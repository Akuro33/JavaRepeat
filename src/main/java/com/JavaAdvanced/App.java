package com.JavaAdvanced;


import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> answerToEverything = () -> {
            TimeUnit.SECONDS.sleep(10);
            return 42;
        };

        Future<Integer> result = executor.submit(answerToEverything);

        Integer integer = result.get();
        System.out.println(integer);

        executor.shutdown();
    }
}
