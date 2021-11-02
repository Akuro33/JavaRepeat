package com.javaReapeat.Objects;

public class Main {

    public static void main(String[] args) {
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
        Person person = new Person();
        person.setName("aDrIaN");
        person.setAge(-99);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
