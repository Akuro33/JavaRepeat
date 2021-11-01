package com.javaReapeat.Lessons2;

public class Loops {

    public void loopWhile() {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public void loopDoWhile() {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 10);

    }

    public void loopFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    public void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(Integer.toString(i) + " * " + Integer.toString(j) + " = " + (i * j));
            }
        }

    }

    public void breakAndContinues () {
        int i = 0;

        while (true) {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
            if (i >= 10) {
                break;
            }
        }
    }

}


