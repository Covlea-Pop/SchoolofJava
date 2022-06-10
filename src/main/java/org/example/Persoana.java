package org.example;

class Persoana {

    // campuri
    String nume;
    int varsta;

    //constructor
    Persoana(String nume, int varsta) {
        //this este o variabila de referinta
        this.nume = nume;
        this.varsta = varsta;
    }

    //constructor
    Persoana() {
        nume = "Alex";
        varsta = 18;
    }

    //metode
    public void cresteVarsta() {
        varsta++;
    }
}