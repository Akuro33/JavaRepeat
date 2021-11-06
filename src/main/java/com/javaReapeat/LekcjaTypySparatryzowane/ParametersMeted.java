package com.javaReapeat.LekcjaTypySparatryzowane;

public class ParametersMeted {
    public static void main(String[] args) {

        Integer[] tablicaLiczb = {1, 2, 3, 4, 5};
        Character[] tablicaZnakow = {'a', 'b', 'c', 'd', 'e'};

        wyswietlElementyTablicy(tablicaLiczb);
        wyswietlElementyTablicy(tablicaZnakow);
    }

    public static <T> void wyswietlElementyTablicy(T[] tablica) {
        for (T element: tablica) {
            System.out.print(element);
        }
        System.out.println();
    }

//    public static void wyswietlElementyTablicy(Integer[] tablica) {
//        for (Integer element: tablica) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }
//
//    public static void wyswietlElementyTablicy(Character[] tablica) {
//        for (Character element: tablica) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }
}

