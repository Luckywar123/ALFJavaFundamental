package com.alfjavafundamental.Praktikum_2;
/*
 Created By IntelliJ IDEA 2023.2.3 (Ultimate Edition)
 Build #IU-232.10203.10, built on 24 October 2023
 Author Luckywar123 a.k.a Andre Luckyta Firdaus
 Java Developper
 Created on 04/11/2023 12:00:30
 @Last Modified 05/10/2023 ‏‎09:39:06
 Version 1.0
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class hitungRataRataMenstrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
            System.out.println("Menu Program :");
            System.out.println("1. Hitung Rata-Rata");
            System.out.println("2. Opsi 2");
            System.out.println("3. Keluar");
            System.out.print("Pilih Opsi (1/2/3):\t");

            String inputPilihan = scanner.next();
            int pilihan ;
            try {
                pilihan = Integer.parseInt(inputPilihan);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan bukan angka yang valid. Pilih ulang.");
                continue; // Kembali ke awal loop
                /*
                try { ... } catch (NumberFormatException e) { ... }: Bagian ini adalah blok
                try-catch yang digunakan untuk mengatasi kesalahan saat mencoba mengonversi
                input (string) ke tipe data integer. Jika input yang diberikan oleh pengguna
                 tidak dapat diubah menjadi integer (misalnya jika pengguna memasukkan teks yang bukan angka),
                 maka program akan menangkap pengecualian NumberFormatException.
                */
            }

            switch (pilihan){
                case 1:
                    clearScreen();
                    hitungRataRata(scanner);
                    /*
                     Note for ClearScreen :
                     This will work on terminals that support ANSI escape codes
                       It will not work on Windows' CMD
                       It will not work in the IDE's terminal
                       source : https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
                    */
                    break;
                case 2:
                    System.out.println("Anda memilih opsi 2");
                    System.out.println("Mohon maaf opsi 2 masih dalam tahap pengembangan");
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Terima kasih! また ね");
                    isRunning = false;
                    break;
                default:
                    clearScreen();
                    System.out.println("Pilih ulang pilihannya");
                    break;
            }
        }
        scanner.close();

    }


    private static void hitungRataRata(Scanner scanner){

        double input = 0;
        double count = 0;
        double total = 0;
        boolean isSatisfied = false;
        System.out.println("=======================================================================================================\n" +
                "Program ini untuk mencari rata rata ( Masukan angka hingga puas dan ketika puas masukkan selain angka )\n" +
                "=======================================================================================================");
        while (!isSatisfied) {
            try {
                System.out.print("Masukkan Angka = \t");
                input = scanner.nextDouble();
                count++;
                total = total + input;
                System.out.println("Total angka sekarang :\t" + total);
                System.out.println();

            } catch (InputMismatchException e) {

                if (count > 0) {
                    double average = total / count;
                    clearScreen();
                    System.out.println("Anda sudah puas???? Baikkk\nTotal averagenya adalah\t " + average);
                    isSatisfied = true;

                } else {
                    clearScreen();
                    System.out.println("Anda belum masukin angka yah Maniezz!!!!! \n");
                    isSatisfied = true;
                }



            }
        }
    }




    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }




}

