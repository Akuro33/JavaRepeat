package com.javaReapeat.LekcjaTypySparatryzowane;

public class ParametrizedInterface {
    public static void main(String[] args) {

        Zamowienie<Integer, Double> zamowienie = new Zamowienie<>(10, 100.123);

        System.out.println("Identyfikator zamowienia, to: " + zamowienie.downloadIdentifier());
        System.out.println("Wartosc zamowienia, to: " + zamowienie.downloadValue());
    }
}

class Zamowienie<I, W> implements Informacje<I, W> {

    private I identifier;
    private W wartosc;

    public Zamowienie(I identifier, W value) {
        this.identifier = identifier;
        this.wartosc = value;
    }

    @Override
    public I downloadIdentifier() {
        return identifier;
    }

    @Override
    public W downloadValue () {
        return wartosc;
    }
}

interface Informacje<I, W> {
    I downloadIdentifier();
    W downloadValue ();
}

