package com.randomcase;
import java.util.*;
public class Menu {
    // Runs menu on a loop
    protected static void start() {
        Scanner scan = new Scanner(System.in);
        String userString = "_";
        Boolean quit = false;


        do {
            printMenu();
            System.out.printf("Please enter a string of text or [Q] to quit: ");
            userString = scan.nextLine();
            quit = isQuit(userString);
            if (quit) {
                continue;
            }
            Character[] newArray = new Character[userString.length()];
            newArray = Randomizer.stringToArray(userString);
            userString = Randomizer.makeRandom(newArray);
            System.out.printf ("Your new string is now: %s\n", userString);
        }
        while (!quit);
    }

    // Prints big line
    protected static void printLine() {
        System.out.println("--------------------------------------------------------------------------------");
    }

    // Prints menu
    protected static void printMenu() {
        printLine();
        System.out.printf ("\tWeLcOmE tO rAnDoMcAsE gEnErAtOr\n");
        printLine();
    }

    // Did the user quit?
    protected static Boolean isQuit(String s) {
        Boolean quit = false;
        s = s.toUpperCase();
        if (s.charAt(0) == 'Q') {
            quit = true;
        }

        return quit;
    }

}
