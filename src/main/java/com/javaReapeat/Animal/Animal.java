package com.javaReapeat.Animal;

public class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("Tasty!");
    }

    public void getVoice() {
        System.out.println("Default voice");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
