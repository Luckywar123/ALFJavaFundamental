package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a,b,c,d,e;
        a = 5;
        b = 2;
        c = a++ * ++b;
        System.out.println("Isi varoabel A "+a);
        System.out.println("Isi varoabel B "+b);
        d = a + b + c;
        e = ( c + d ) * a - b;
        System.out.println("Main.main " + "Isi Variabel A " + a);
        System.out.println("Isi varoabel E "+e);
        System.out.println("Isi varoabel A "+a);
        System.out.println("Isi varoabel B "+b);
        System.out.println("Isi varoabel C "+c);
        System.out.println("Isi varoabel D "+d);
        System.out.printf("Hello and welcome!");

    }
}