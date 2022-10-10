package de.fizzbuzz.main.game;

import de.fizzbuzz.main.colors.TerminalColors;

import java.util.Scanner;

public class FizzBuzz {

    private final Scanner scanner = new Scanner(System.in);
    private int parameter = 0;


    public void run() {
        this.gameLogic();
    }


    private void checkIfNumberToHighOrToLow() {
        parameter = Integer.parseInt(scanner.nextLine());
        if (parameter > 100 || parameter < 0) {
            System.out.println("Die Nummer "+TerminalColors.ANSI_YELLOW + parameter +TerminalColors.ANSI_RESET+ " liegt nicht zwischen"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
        }
    }

    private void CheckIfParameterCanBeDividedByThree() {
        if (parameter % 3 == 0) {
            System.out.println("Fizz");
        }
    }

    private void CheckIfParameterCanBeDividedByFive() {
        if (parameter % 5 == 0) {
            System.out.println("Buzz");
        }
    }

    private void CheckIfParameterCanBeDividedByThreeAndFive() {
        if (parameter % 3 == 0 && parameter % 5 == 0) {
            System.out.println("FizzBuzz");
        }
    }

    private void CheckIfParameterCantBeDividedByThreeAndFive() {
        if (parameter % 3 != 0 && parameter % 5 != 0) {
            System.out.println("Die Zahl "+TerminalColors.ANSI_GREEN+ parameter +TerminalColors.ANSI_RESET+ " konnte nicht dividiert werden durch "+TerminalColors.ANSI_RED+"3 oder 5"+TerminalColors.ANSI_RESET+".");
        }
    }


    private void gameLogic() {
        System.out.println("Gib eine "+ TerminalColors.ANSI_BLUE+"Nummer"+TerminalColors.ANSI_RESET+" ein von"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
        this.checkIfNumberToHighOrToLow();
        this.CheckIfParameterCanBeDividedByThree();
        this.CheckIfParameterCanBeDividedByFive();
        this.CheckIfParameterCanBeDividedByThreeAndFive();
        this.CheckIfParameterCantBeDividedByThreeAndFive();
        }
    }
