package com.randomcase;
import java.util.Random;

public class Randomizer {

    // Iterate through string and randomize
    protected static String makeRandom(String s) {
        // Create array 
        Character[] charArray = new Character[s.length()];
        // Iterate through string and input into array
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        // Return string primed
        String randomString = "";
        // Iterate through array and create a string
        for (int i = 0; i < charArray.length; i++) {
            Random randomNumber = new Random();
            int rando = randomNumber.nextInt(2);
            String temp = "";
            temp = charArray[i].toString();

            if (rando == 0) {
                temp = temp.toUpperCase();      
            }
            else {
                temp = temp.toLowerCase();
            }
            randomString += temp;
        }
        return randomString;
    }
}