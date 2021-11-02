package com.javaReapeat.AccessModifiers.close;

public class A {
    public int varPublic; // Widoczne wszędzie
    protected int varProtected; // niewidoczna dla zewnętrznych elementów
    int varDefault; // nie widoczna już dla klasy dziedzicznej
    private int varPrivate; // widoczna tylko w tej klasie

    void test() {

    }
}