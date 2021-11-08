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
/*        int i = 0;
        while (!result.isDone()){
            System.out.println("Brak Wyniku po raz: " + ++i );
            TimeUnit.SECONDS.sleep(2);
        }*/


        Integer integer = null;
        try {
            integer = result.get(4, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(integer);

        executor.shutdown();
    }
}
