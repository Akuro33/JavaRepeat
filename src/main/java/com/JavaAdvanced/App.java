package com.JavaAdvanced;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture.runAsync( () -> System.out.println("Wątek: "+ Thread.currentThread().getName()));

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        }, executor ).thenApply(r -> {
            System.out.println("*2 " + Thread.currentThread().getName());
            return r*2;
        }).thenApply(r -> {
            System.out.println("+1 " + Thread.currentThread().getName());
            return r+1;});

        Integer result = integerCompletableFuture.get();
        System.out.println((result*2)+1);



       /* Callable<Integer> answerToEverything = () -> {
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
*/


        executor.shutdown();
    }
}
