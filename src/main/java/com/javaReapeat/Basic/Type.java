package com.javaReapeat.Basic;

public class Type {


    public void type (String[] args) {
        /* LICZBOWE - CAŁKOWITE */
        byte zmByte = Byte.MAX_VALUE;
        short zmShort = Short.MAX_VALUE;
        int zmInt = Integer.MAX_VALUE;
        long zmLong = Long.MAX_VALUE;
        zmLong = 2356789L;

        /* LICZBOWE - ZMIENNOPRZECINKOWE */
        float zmFloat = 25.525F;
        double zmDouble = 50.782D;

        /* LOGICZNE */
        boolean zmBool = false;

        /* ZNAKOWE */
        char zmChar = 'A';

        String zmString = "Tekst";

        zmChar = zmString.charAt(0);
        System.out.println(zmChar);
    }
}
