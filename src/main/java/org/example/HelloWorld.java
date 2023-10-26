package org.example;

public class HelloWorld {

    public static void main(String[] args) {

       int a = 165;
       int b = 108;
       int hasil;

       hasil = a & b;
        System.out.println("Hasil dari a & b = " + hasil);
        hasil = a | b;
        System.out.println("Hasil dari a | b = " + hasil);
        hasil = a ^ b;
        System.out.println("Hasil dari a ^ b = " + hasil);
        hasil = ~a;
        System.out.println("Hasil dari a ~ b = " + hasil);
        hasil = a >> 4;
        System.out.println("Hasil dari a > b = " + hasil);
        hasil = b << 3;
        System.out.println("Hasil dari a < b = " + hasil);

    }

}
