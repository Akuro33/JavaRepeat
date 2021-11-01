package com.javaReapeat.Objects;

public class Main {

    public static void main(String[] args) {
        createMovies();
        createPerson();
    }

    public static void createMovies () {
        Movie avatar = new Movie();
        avatar.title = "Avatar";
        avatar.year = 2009;

        Movie titanic = new Movie();
        titanic.title = "Titanic";
        titanic.year = 1997;

        titanic.info();
        avatar.info();

        Movie movie1 = avatar;
        movie1.info();
        movie1.title = "Random";
        avatar.info();
    }

    public static void createPerson () {
        Person p1 = new Person("Adrian", 18);
        Person p2 = new Person("Bartek");

        System.out.println(p1.name + ", " + p1.age);
        System.out.println(p2.name + ", " + p2.age);
    }

}
