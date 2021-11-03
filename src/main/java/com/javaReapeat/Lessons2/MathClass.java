package com.javaReapeat.Lessons2;

public class MathClass {

public void mathExamples () {
    System.out.println("Pi wynosi: " + Math.PI);
    System.out.println(Math.E);

    System.out.println("Potęgowanie. 4 do potęgi 2 = " + Math.pow(4, 2));
    System.out.println("Pierwastkowie. Pierwiastek drugiego stopnia z 4" + Math.sqrt(4));
    System.out.println("Pierwastkowanie. Pierwiastek czwartego stopnia z 16 =  " + Math.pow(4, 1.0/4.0));

    System.out.println("Logarytm " + Math.log(Math.E));
    System.out.println("Logarytm dziesiętny " + Math.log10(100));

    System.out.println("Sinus: " + Math.sin(Math.toRadians(90)));
}

}
