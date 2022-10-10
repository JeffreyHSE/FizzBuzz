package de.fizzbuzz.main.game;

import de.fizzbuzz.main.colors.TerminalColors;

import java.util.Scanner;

public class FizzBuzz {

    private final Scanner scanner = new Scanner(System.in);
    private int parameter = 0;

    private int parameterThree = 3;

    private int parameterFive = 5;

    private boolean toHighChecker = true;

    private boolean checkIfBoth = true;


    public void run() throws Exception {
        this.gameLogic();
    }


    public int checkIfNumberToHighOrToLow(int parameter) throws Exception {
        if (parameter > 100 || parameter < 0) {
            System.out.println("Die Nummer "+TerminalColors.ANSI_YELLOW + parameter +TerminalColors.ANSI_RESET+ " liegt nicht zwischen"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
            toHighChecker = false;
            throw new Exception("Exception message");
        }
        return parameter;
    }

    public int CheckIfParameterCanBeDividedByThree(int parameterThree) {
        if (!checkIfBoth) return parameterThree;
        if (!toHighChecker) return parameterThree;
        if (parameter % parameterThree == 0) {
            System.out.println("Fizz");
        }
        return parameterThree;
    }

    public int CheckIfParameterCanBeDividedByFive(int parameterFive) {
        if (!checkIfBoth) return parameterFive;
        if (!toHighChecker) return parameterFive;
        if (parameter % parameterFive == 0) {
            System.out.println("Buzz");
        }
        return parameterFive;
    }

    public Parameter CheckIfParameterCanBeDividedByThreeAndFive(int parameterThree, int parameterFive) {
        if (!toHighChecker) return new Parameter(parameterThree, parameterFive);
        if (parameter % parameterThree == 0 && parameter % parameterFive == 0) {
            System.out.println("FizzBuzz");
            checkIfBoth = false;
        }
        return new Parameter(parameterThree, parameterFive);

    }

    public Parameter CheckIfParameterCantBeDividedByThreeAndFive(int parameterThree, int parameterFive) {
        if (!toHighChecker) return new Parameter(parameterThree, parameterFive);
        if (parameter % 3 != 0 && parameter % 5 != 0) {
            System.out.println("Die Zahl "+TerminalColors.ANSI_GREEN+ parameter +TerminalColors.ANSI_RESET+ " konnte nicht dividiert werden durch "+TerminalColors.ANSI_RED+"3 oder 5"+TerminalColors.ANSI_RESET+".");
        }
        return new Parameter(parameterThree, parameterFive);
    }


    private void gameLogic() throws Exception {
        System.out.println("Gib eine "+ TerminalColors.ANSI_BLUE+"Nummer"+TerminalColors.ANSI_RESET+" ein von"+TerminalColors.ANSI_RED+" 1-100"+TerminalColors.ANSI_RESET+"!");
        parameter = Integer.parseInt(scanner.nextLine());
        this.checkIfNumberToHighOrToLow(parameter);
        this.CheckIfParameterCanBeDividedByThreeAndFive(parameterThree, parameterFive);
        this.CheckIfParameterCanBeDividedByThree(parameterThree);
        this.CheckIfParameterCanBeDividedByFive(parameterFive);
        this.CheckIfParameterCantBeDividedByThreeAndFive(parameterThree, parameterFive);
        }
    }
