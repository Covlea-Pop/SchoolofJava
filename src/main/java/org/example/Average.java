package org.example;

import java.util.Scanner;

public class Average {
    double nr1, nr2, nr3;

    public Average(){
        nr1 = 0.0;
        nr2 = 0.0;
        nr3 = 0.0;

    }
    Average(int nr1, int nr2, int nr3){
        Scanner sc = new Scanner(System.in);
        this.nr1 = sc.nextDouble();
        this.nr2 = sc.nextDouble();
        this.nr3 = sc.nextDouble();
    }

    public double average(){
        return (this.nr1+this.nr2+this.nr3)/3;
    }
}
