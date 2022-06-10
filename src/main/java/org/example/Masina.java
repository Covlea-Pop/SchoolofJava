package org.example;


class Masina {

    String marca;
    String culoare;
    double capacitateMotor;

    Masina() {
        System.out.println("Constructorul e apelat");
    }

    Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    Masina(String marca) {
        this.marca = marca;
        System.out.println("Am creat un obiect cu al 3 lea constructor");
    }

    public double seteazaCapacitateMotor(double capacitateMotor) {
        return this.capacitateMotor = capacitateMotor;
    }

}
