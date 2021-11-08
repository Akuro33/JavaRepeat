package com.JavaAdvanced;

public class App {

    public static void main(String[] args) {
        System.out.println("Główny Wątek aplikacji: " + Thread.currentThread().getName());
        Thread thread = new MyThread("My-Thread-1");
        Thread secondThread = new MyThread("My-Thread-2");

        thread.start();
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println( "Wykonywany Wątek Runnable: " + Thread.currentThread().getName());
           }
       };
       Thread anotherThread = new Thread(runnable, "My-Runnable-1");
       anotherThread.start();
    }
}
