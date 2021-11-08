package com.JavaAdvanced;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> answerToEverything = () -> {
            TimeUnit.SECONDS.sleep(10);
            return 42;
        };

        Callable<Integer> anotherAnswerToEverything = () -> {
            TimeUnit.SECONDS.sleep(13);
            return 43;
        };

        Callable<Integer> finalAnswerToEverything = () -> {
            TimeUnit.SECONDS.sleep(5);
            return 44;
        };

        List<Callable<Integer>> callablesList = Arrays.asList(answerToEverything, anotherAnswerToEverything, finalAnswerToEverything);
        List<Future<Integer>> futuresList = executor.invokeAll(callablesList);

        Integer integer = executor.invokeAny(callablesList);

        System.out.println(integer);
        for (Future<Integer> f: futuresList)
        {
            System.out.println(f.get());
        }


        executor.shutdown();
    }
}
