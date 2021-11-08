package com.JavaAdvanced;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {


    public void run() {
        IntStream.rangeClosed(1,20).forEach(i -> System.out.println( i + " | Wykonywany Wątek: " + Thread.currentThread().getName()));
    }
}
