package org.example;

import org.example.Average;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        //afisari pe aceeasi linie
//        System.out.println("Afisari pe aceeasi linie");
//        System.out.print("Alex ");
//        System.out.println("Sal");
//
//       primitive
//        System.out.println("Primitive");
//        int a = 8;
//        double b = 3.5;
//        float c = 3;
//        boolean var = true;
//        char ch = 'e';
//        System.out.println(a + " " + b + " " + c + " " + var + ch);
//
//
//        //non-primitive
//        System.out.println("Non-primitive");
//        String nume = "Alex";
//        String firma = "Endava";
//        System.out.println("");
//        System.out.println("Salut, numele meu este   " + nume + " si lucrez la " + firma);
//
//       citirea de la tastatura
//        System.out.println("Citire de la tastatura");
//        Scanner sca = new Scanner(System.in);
//        String newLine = sca.nextLine();
//        int nr = sca.nextInt();
//        System.out.println("Eu sunt " + newLine + " si am " + nr + " ani.");
//
//        //operatori
//        //aritmetici    + - * / % ^
//        System.out.println("aritmetici");
//        int x1 = 17;
//        int x2 = 3;
//        int x3 = 24;
//        System.out.println(x1 * x2);
//        System.out.println(x1 / x2);
//        System.out.println(x1 % x2);
//        System.out.println(x3 % x2);
//        System.out.println(50 / x2);
//
//        //incrementare
//        System.out.println("incrementare");
//        x1++;
//        System.out.println(x1);
//        ++x1;
//        System.out.println(x1);
//        x1 += 1;
//        System.out.println(x1);
//
//        //de comparatie
////          ==, >, >=, <, <=, !=
//
//        //logici
////         &&, ||, ! not operator
//
//        //if
//        if (x1 < x3) {
//            System.out.println("x1 este mai mic decat x3");
//        } else {
//            System.out.println("x1 nu este mai mic decat x3");
//        }
//
//
//        //if inlantuit
//        if (x1 < x3 || x1 <= x2) {
//            System.out.println("x1 este mai mic decat x3 si mai mare sau egal decat x2");
//        } else {
//            System.out.println("x1 este mai mare decat x3");
//        }
//        System.out.println("");
//
//
//        //switch
//        Scanner scan = new Scanner(System.in);
//        String role = scan.nextLine();
//        if (role.equals("admin")) {
//            System.out.println("you are an admin");
//        } else if (role.equals("moderator")) {
//            System.out.println("you are a moderator");
//        } else {
//            System.out.println("you are a basic user");
//        }
//
//        System.out.println("");
////
//        switch (role) {
//            case "admin":
//                System.out.println("Esti admin");
//                break;
//            case "moderator":
//                System.out.println("Esti moderator");
//                break;
//            default:
//                System.out.println("Esti un user basic");
//        }
//
//        int dayOfTheWeek = scan.nextInt();
//        if (dayOfTheWeek > 0 && dayOfTheWeek < 8) {
//            switch (dayOfTheWeek) {
//                case 1:
//                    System.out.println("Luni");
//                    break;
//                case 2:
//                    System.out.println("Marti");
//                    break;
//                case 3:
//                    System.out.println("Miercuri");
//                    break;
//                case 4:
//                    if (x1 < x3)
//                        System.out.println("Joi");
//                    x1++;
//                    System.out.println(x1);
//                    break;
//                case 5:
//                    System.out.println("Vineri");
//                    break;
//                case 6:
//                    System.out.println("Sambata");
//                    break;
//                default:
//                    System.out.println("Duminica");
//            }
//        }
////        } else {
////            System.out.println("Ziua saptamanii este incorecta");
////        }
//
////
////        Given two non-negative int values, return true if they have the same last digit,
////         such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
////
////        lastDigit(7, 17) → true
////        lastDigit(6, 17) → false
////        lastDigit(3, 113) → true
//
//        int a1;
//        int b1;
//        Scanner sc = new Scanner(System.in);
//        a1 = sc.nextInt();
//        b1 = sc.nextInt();
//
//        int ultimaCifraA = a1 % 10;
//        int ultimaCifraB = b1 % 10;
//
//        if (ultimaCifraA == ultimaCifraB) {
//            System.out.println(true);
//        } else {
//            System.out.println("false");
//        }
//
////        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//
//
//        Scanner scanner = new Scanner(System.in);
//        int a2 = scanner.nextInt();
//        int b2 = scanner.nextInt();
//        int c2 = scanner.nextInt();
//
//        if (a2 >= 13 && a2 <= 19 || b2 >= 13 && b2 <= 19 || c2 >= 13 && c2 <= 19) {
//            System.out.println(true);
//        }

//        hasTeen(13, 20, 10) → true
//        hasTeen(20, 19, 10) → true
//        hasTeen(20, 10, 13) → true

//        String originalString = "abcde";
//
//        char[] c = originalString.toCharArray();
//
//// Replace with a "swap" function, if desired:
//        char temp = c[4];
//        c[4] = c[3];
//        c[3] = temp;
//
//        String swappedString = new String(c);
//
//        System.out.println(originalString);
//        System.out.println(swappedString);

//        String s = "abcde".replaceAll("de", "ed");
//        System.out.println(s);

//        Average avr = new Average(2,3,4);
//        System.out.println(avr.average());

//        Scanner sc = new Scanner(System.in);
//        double nr1 = sc.nextDouble();
//        double nr2 = sc.nextDouble();
//        Complex cp = new Complex();
//        cp.sum(nr1,nr2);
//        cp.difference(nr1,nr2);
//        cp.prod(nr1,nr2);


//
//    }
//
//}
public class Main {
    public static void main(String[] args) {
//
//        Persoana pers1 = new Persoana();
//        System.out.println(pers1.nume + " " + pers1.varsta);
//        pers1.cresteVarsta();
//        System.out.println(pers1.varsta);
//
//        Persoana pers2 = new Persoana("Marius", 20);
//        System.out.println(pers2.nume + " " + pers2.varsta);
//        pers2.cresteVarsta();
//        System.out.println(pers2.varsta);
//
//        Masina mercedes = new Masina();
//        mercedes.seteazaCapacitateMotor(2.4);
//        System.out.println(mercedes.capacitateMotor + " " + mercedes.marca);
//
//        Masina bmw = new Masina("BMW", "rosu");
//        bmw.seteazaCapacitateMotor(3.0);
//        System.out.println(bmw.marca + " " + bmw.capacitateMotor);
//
//        Masina audi = new Masina("Audi");
        /*Average avr = new Average();
        System.out.println(avr.average());
        double variablila = avr.average();
        System.out.println(variablila);*/
//        Scanner sc = new Scanner(System.in);
//        double n1 = sc.nextDouble();
//        double n2 = sc.nextDouble();
//        Complex cp = new Complex();
//        cp.sum(n1,n2);
//        cp.difference(n1,n2);
//        cp.prod(n1,n2);

//
//        Mobila dulap = new Mobila();
//        System.out.println(dulap.inaltime + " " + dulap.lungime);
//        dulap.inaltime = 12;
//        dulap.lungime = 21;
//        System.out.println(dulap.inaltime + " " + dulap.lungime);
//        dulap.setareLungime();
//        System.out.println(dulap.lungime);
    }
}

//    modificatori de access

//    default - accesibil in acelasi pachet
//    private - accesibile in aceeasi clasa
//    protected - in acelasi pachet sau subclase in pachete diferite
//    public - cel mai permisiv dintre toate, poti accesa o clasa publica de oriunde





