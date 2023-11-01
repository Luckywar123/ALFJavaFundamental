package com.alfjavafundamental.Prak1;
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
public class Main {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        StringBuilder ch2 = new StringBuilder();
        char ch = '\0'; // Deklarasi variabel ch di luar loop
        System.out.print("Masukkan Text yang Ingin di Parsing dengan Ketentuan \n");
        String text = input.nextLine();
        char[] ascii1 = text.toCharArray();

        for (int i = 0; i < ascii1.length; i++) {
            ch = ascii1[i]; // Assign nilai karakter ke variabel ch
            System.out.println((int) ch + " ");

            if (ch >= 32 && ch <= 96) {
                ch2.append(ch);
            }
        }

        System.out.println("Isi ASCII dengan ketentuan = " + ch2);
        System.out.println("Text Awal Adalah = " + text);

    }
}