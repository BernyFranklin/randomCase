package com.randomcase;
import java.util.*;
public class Menu {
    // Runs menu on a loop
    protected static void start() {
        // Local variables
        Scanner scan = new Scanner(System.in);
        String userString = "_";
        Boolean quit = false;
        String welcome = "Welcome to randomcase generator";
        String exit = "Thank you for using randomcase generator";
        // Print header
        printBanner(welcome);
        // Loop interface until 'Q' detected
        while (!quit) {
            // User prompt
            System.out.printf("Please enter a string of text or [Q] to quit:\t");
            // Scan input
            userString = scan.nextLine();
            // Did they quit?
            quit = isQuit(userString);
            if (quit) {
                continue;
            }
            // Make original string random
            userString = Randomizer.makeRandom(userString);
            // Display new string
            System.out.printf ("Your new string is now:\t\t\t\t%s\n\n", userString);
        }
        // Adios
        printBanner(exit);
        scan.close();
    }

    // Prints big line
    protected static void printLine() {
        System.out.println("--------------------------------------------------------------------------------");
    }

    // Prints menu
    protected static void printBanner(String s) {
        // Pass string to randomizer
        s = Randomizer.makeRandom(s);
        printLine();
        // Print message
        System.out.printf ("\t\t%s\n", s);
        printLine();
    }

    // Did the user quit?
    protected static Boolean isQuit(String s) {
        // Prime
        Boolean quit = false;
        // Convert to upper
        s = s.toUpperCase();
        // Is input only 'Q'?
        if (s.charAt(0) == 'Q' && s.length() == 1) {
            // Set flag
            quit = true;
        }

        return quit;
    }

}
