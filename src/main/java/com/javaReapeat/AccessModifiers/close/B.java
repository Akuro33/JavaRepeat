package com.javaReapeat.AccessModifiers.close;

public class B extends A {
    void test() {
        super.varPublic = 1;
        super.varProtected = 1;
        super.varDefault = 1;

    }
}

