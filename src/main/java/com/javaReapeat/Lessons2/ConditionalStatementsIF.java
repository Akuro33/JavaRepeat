package com.javaReapeat.Lessons2;

public class ConditionalStatementsIF {

    public void conditionalStatementsIF() {
        int age = 16;

        if (age >= 18) {
            System.out.println("Pełnoletni");
        } else {
            System.out.println("Niepełnoletni");
        }

    }

    public void conditionalStatementsElseIf() {
        int number = 0;

        if (number > 0) {
            System.out.println("Liczba większa od zera");
        } else if (number == 0) {
            System.out.println("Liczba jest równa zero");
        } else {
            System.out.println("Liczba mniejsza od zera");
        }

    }

}
