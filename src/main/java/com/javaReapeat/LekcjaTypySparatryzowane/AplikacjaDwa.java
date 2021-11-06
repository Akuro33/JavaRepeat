package com.javaReapeat.LekcjaTypySparatryzowane;

public class AplikacjaDwa {
    public static void main(String[] args) {

        KlasaGeneryczna<Double, Object> klasaGeneryczna = new KlasaGeneryczna<>(10.0, "Jeden");
        klasaGeneryczna.nazwaTypuGenerycznego();

        double wartosc = klasaGeneryczna.getPoleGeneryczne();
    }
}
