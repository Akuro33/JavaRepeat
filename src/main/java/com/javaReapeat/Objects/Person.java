package com.javaReapeat.Objects;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            this.name = name;
        }
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }
}
