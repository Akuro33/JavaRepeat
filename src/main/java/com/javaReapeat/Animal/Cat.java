package com.javaReapeat.Animal;

final public class Cat extends Animal {
    String color;

    public void getVoice() {
        System.out.println("Meow");
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }


}

