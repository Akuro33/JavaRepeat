package com.javaReapeat.Animal;

public class Cat extends Animal implements Eat {
    @Override
    public void getVoice() {
        System.out.println("Meow");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Tasty " + type);
    }
}