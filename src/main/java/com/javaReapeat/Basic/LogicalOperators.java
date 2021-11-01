package com.javaReapeat.Basic;

public class LogicalOperators {

    public LogicalOperators() {
        boolean zmienna;
        System.out.println(zmienna = 2 == 1 || 5 > 10);
        System.out.println(zmienna = 2 == 2 && 15 > 10);
        System.out.println(zmienna = !true);

        System.out.println(zmienna = true || false && !false);
        System.out.println(zmienna = (true || false) && !false);

        System.out.println(zmienna);
    }
}
