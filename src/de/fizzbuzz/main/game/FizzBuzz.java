package de.fizzbuzz.main.game;

import de.fizzbuzz.main.colors.TerminalColors;

import java.util.Scanner;

public class FizzBuzz {

    private final Scanner scanner = new Scanner(System.in);
    private int parameter = 0;
    public static String returnValue;


    public void run() throws Exception {
        gameLogic();
    }

    public String calculate(int parameter) throws Exception {
        if (parameter > 100 || parameter < 0) {
            System.out.println("Die Nummer "+TerminalColors.ANSI_YELLOW + parameter +TerminalColors.ANSI_RESET+ " liegt nicht zwischen"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
            throw new Exception("Exception");
        }

        if (parameter % 3 == 0 && parameter % 5 == 0) {
            System.out.println("FizzBuzz");
            return returnValue =  "FizzBuzz";
        }

        if (parameter % 3 == 0) {
            System.out.println("Fizz");
            return returnValue = "Fizz";
        }

        if (parameter % 5 == 0) {
            System.out.println("Buzz");
            return returnValue = "Buzz";
        }

        System.out.println("Die Zahl "+TerminalColors.ANSI_GREEN+ parameter +TerminalColors.ANSI_RESET+ " konnte nicht dividiert werden durch "+TerminalColors.ANSI_RED+"3 oder 5"+TerminalColors.ANSI_RESET+".");

        return returnValue = Integer.toString(parameter);
    }


    private void gameLogic() throws Exception {
        System.out.println("Gib eine "+ TerminalColors.ANSI_BLUE+"Nummer"+TerminalColors.ANSI_RESET+" ein von"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
        parameter = Integer.parseInt(scanner.nextLine());
        calculate(parameter);
        }
    }