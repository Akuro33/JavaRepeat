package com.javaReapeat.Lessons2;

import java.util.Scanner;

public class Calculator {

    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Podaj wartość a = ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Podaj wartość b = ");
        b = scanner.nextInt();

        System.out.println("Wynik dodawnia: " + (a + b));
        System.out.println("Wynik odejmowania: " + (a - b));
        System.out.println("Wynik mnożenia: " + (a * b));
        if (b != 0) {
            System.out.println("Wynik dzielenia: " + ((float) a / (float) b));
            System.out.println("Reszta z dzielenia: " + (a % b));
        }
        else{
            System.out.println("Dzielenie przez 0 zabronione!");
        }
    }
}

