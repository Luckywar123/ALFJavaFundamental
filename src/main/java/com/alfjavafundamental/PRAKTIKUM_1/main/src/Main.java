package com.alfjavafundamental.PRAKTIKUM_1.main.src;
/*
 Created By IntelliJ IDEA 2023.2.3 (Ultimate Edition)
 Build #IU-232.10203.10, built on 24 October 2023
 Author Luckywar123 a.k.a Andre Luckyta Firdaus
 Java Developper
 Created on 31/10/2023 15:25
 @Last Modified 31/10/2023 xx:xx
 Version 1.0
*/

import java.util.Scanner;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootAplication;
*/
public class Main {

    public static void main(String[] args) {
    /*SpringApplication.run(Main.class, args);*/
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Text yang Ingin di Parsing dengan Ketentuan: \n");
        String text = input.nextLine();
        char[] ascii1 = text.toCharArray();
        int ch2 = 0; // Inisialisasi variabel untuk menyimpan jumlah karakter ASCII

        for (int i = 0; i < ascii1.length; i++) {
            char ch = ascii1[i]; // Ambil karakter saat ini
            int asciiValue = (int) ch; // Ambil nilai ASCII dari karakter

            if (asciiValue >= 32 && asciiValue <= 96) {
                ch2 += asciiValue; // Menambahkan nilai ASCII ke total
            }
        }
        System.out.println("Jumlah ASCII dengan ketentuan = " + ch2);
        System.out.println("Text Awal Adalah = " + text);

    }
}