package com.javaReapeat.Basic;

public class ConversionCasting {
    public ConversionCasting() {
        /* Rzutowanie niejawne */
        short zmShort = 125;
        int zmInt;
        zmInt = (int)zmShort;
        System.out.println(zmInt);

        /* Rzutowanie jawne */
        float zmFloat = 3.0F;
        long zmLong;
        zmLong = (long)zmFloat;
        short zmShort2 = (short)zmLong;
        System.out.println(zmLong);

        /* Liczbowe > String */
        String tekst = String.valueOf(zmInt);
        tekst = Long.toString(zmLong);
        System.out.println(tekst);

        /* String > Liczbowe */
        String tekst2 = "123.5";
        float zmFloat2 = Float.parseFloat(tekst2);
        System.out.println(zmFloat2 + 100);
        System.out.println(tekst2 + 100 + "tekst");
    }
}
