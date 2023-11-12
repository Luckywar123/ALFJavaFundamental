package com.alfjavafundamental.praktikum_1.randomstringASCII;

import java.util.Random;

public class randomstringASCII {
    protected String randkecil()
    {
        int kecilleftLimit = 97; // letter 'a'
        int kecilrightLimit = 122; // letter 'z'
        int targetStringLength = 21;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = kecilleftLimit + (int)
                    (random.nextFloat() * (kecilrightLimit - kecilleftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public String randkapital(){
        int kapitalleftlimit = 65; //"Letter A"
        int kapitalrightlimit = 90; // "Letter Z"
        int targetStringLength = 1;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++){
            int randomLimitedInt = kapitalleftlimit + (int) (random.nextFloat() * (kapitalrightlimit - kapitalleftlimit + 1));

            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public static void main(String[] args) {
        randomstringASCII random = new randomstringASCII();

        String kapital = random.randkapital();
        String kecil = random.randkecil();

        System.out.println(kapital + kecil);
    }



}