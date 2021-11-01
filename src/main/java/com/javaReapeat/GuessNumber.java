package com.javaReapeat;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userNumber;

        do {
            System.out.print("Zgadnij liczbę z przedziału 1 - 10: ");
            userNumber = scanner.nextInt();
            i++;
            if (userNumber < rndNumber) {
                System.out.println("Twoja liczba jest za mała");
            } else if (userNumber > rndNumber) {
                System.out.println("Twoja liczba jest zbyt duża");
            }
        } while (userNumber != rndNumber);
        System.out.println("BRAWO! Odgadłeś za " + i + " razem!");
    }
}
