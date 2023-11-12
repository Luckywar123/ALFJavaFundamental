package com.alfjavafundamental.paktikum_3.menghitungDataDinamis;

import java.util.Random;

public class randomString {
    public static void main(String[] args) {
        // Memanggil metode rand
        rand();
    }

    public static void rand() {
        Random random = new Random();
        int targetStringLength = random.nextInt(14) + 12; // Generate random string antara 12 - 25
        String randomString = generateString(targetStringLength); // Generate string dengan pola tertentu

        System.out.println(randomString);
    }

    private static String generateString(int length){
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        String vokal = "aiueo";
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        char firstChar = getRandomChar(vokal+konsonan);

        //Huruf awal uppercase
        result.append(Character.toUpperCase(firstChar));

        //MENENTUKAN VOKAL ATAU BUKAN
        boolean isVokal = (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u');
        for (int i = 0; i < 7; i++) {
            char nextChar;
            if (isVokal) {
                nextChar = getRandomChar(konsonan);
            } else {
                nextChar = getRandomChar(vokal);
            }
            result.append(nextChar);
            isVokal = !isVokal; // Toggle antara vokal dan konsonan
        }


        // Karakter sisanya (karakter ke 8 dst) random
        for (int i = 1; i <= length - 7; i++) {
            char nextChar = getRandomChar(vokal + konsonan);
            result.append(nextChar);
        }

        return result.toString();
    }
    private static char getRandomChar(String source) {
        Random random = new Random();
        int index = random.nextInt(source.length());
        return source.charAt(index);
    }
    }

