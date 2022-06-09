package org.example;

public class Complex {
    double nr1, nr2;

    public void sum(double nr1, double nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;


        System.out.println(nr1 + nr2);
    }

    public void difference(double nr1, double nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        System.out.println(nr1 - nr2);
    }

    public void prod(double nr1, double nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        System.out.println(nr1 * nr2);

    }


}
