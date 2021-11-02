package com.javaReapeat.Animal;

final public class Cat extends Animal {
    String color;


    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }


    @Override
    public void getVoice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "I'm " + super.name;
    }
}

