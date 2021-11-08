package com.JavaAdvanced;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        final boolean err = true;

        CompletableFuture.runAsync( () -> System.out.println("Wątek: "+ Thread.currentThread().getName()), executor);

        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (err) {
                try {
                    throw new IllegalAccessException("Wrong argument");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return 42;
        }, executor).exceptionally(exception -> {
            System.out.println("ERROR!! "+ exception.getMessage());
            return 2;
        }).thenApply(r -> {
                    System.out.println("*2 " + Thread.currentThread().getName());
                    return r * 2;
                } ).thenApply(r -> {
            System.out.println("+1 " + Thread.currentThread().getName());
            return r + 1;
        });

/*

        integerCompletableFuture.thenApply(r -> {
            System.out.println("*2 " + Thread.currentThread().getName());
            return r * 2;
        });
        integerCompletableFuture
        });
        integerCompletableFuture.thenApply(r -> {
            System.out.println("sout " + Thread.currentThread().getName());
            System.out.println(r);
            return r;
        });
*/





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
