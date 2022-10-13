package de.fizzbuzz.main.game;

import de.fizzbuzz.main.colors.TerminalColors;

import java.util.Scanner;

public class FizzBuzz {

    private final Scanner scanner = new Scanner(System.in);
    private int parameter = 0;
    private boolean checkIfBoth = true;


    public void run() throws Exception {
        gameLogic();
    }


    public int checkIfNumberToHighOrToLow(int parameter) throws Exception {
        if (parameter > 100 || parameter < 0) {
            System.out.println("Die Nummer "+TerminalColors.ANSI_YELLOW + parameter +TerminalColors.ANSI_RESET+ " liegt nicht zwischen"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
            throw new Exception("Exception message");
        }
        return parameter;
    }

    public String checkIfParameterCanBeDividedByThree(int parameter) {
        if (!checkIfBoth) {
            return "";
        }
        if (parameter % 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        }
        return "nothing";
    }

    public String checkIfParameterCanBeDividedByFive(int parameter) {
        if (!checkIfBoth) {
            return "";
        }
        if (parameter % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        }
        return "nothing";
    }

    public String checkIfParameterCanBeDividedByThreeAndFive(int parameter) {
        if (parameter % 3 == 0 && parameter % 5 == 0) {
            System.out.println("FizzBuzz");
            checkIfBoth = false;
            return "FizzBuzz";
        }
        return "nothing";

    }

    public int checkIfParameterCantBeDividedByThreeAndFive(int parameter) {
        if (parameter % 3 != 0 && parameter % 5 != 0) {
            System.out.println("Die Zahl "+TerminalColors.ANSI_GREEN+ parameter +TerminalColors.ANSI_RESET+ " konnte nicht dividiert werden durch "+TerminalColors.ANSI_RED+"3 oder 5"+TerminalColors.ANSI_RESET+".");
            return parameter;
        }
        return 0;
    }


    private void gameLogic() throws Exception {
        System.out.println("Gib eine "+ TerminalColors.ANSI_BLUE+"Nummer"+TerminalColors.ANSI_RESET+" ein von"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
        parameter = Integer.parseInt(scanner.nextLine());
        checkIfNumberToHighOrToLow(parameter);
        checkIfParameterCanBeDividedByThreeAndFive(parameter);
        checkIfParameterCanBeDividedByThree(parameter);
        checkIfParameterCanBeDividedByFive(parameter);
        checkIfParameterCantBeDividedByThreeAndFive(parameter);
        }
    }