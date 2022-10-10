package de.fizzbuzz.main.gameTest;

import de.fizzbuzz.main.game.FizzBuzz;
import de.fizzbuzz.main.game.Parameter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {

    private final FizzBuzz cut = new FizzBuzz();

        @Test
         public void checkIfNumberToHighOrToLowTest() throws Exception {
            cut.checkIfNumberToHighOrToLow(50);
       }

       @Test
        public void CheckIfParameterCanBeDividedByThree() {
           int p = cut.CheckIfParameterCanBeDividedByThree(3);
           int expectedNumber = 3;
           assertThat(p, is(expectedNumber));
       }

       @Test
        public void CheckIfParameterCanBeDividedByFive() {
            int p = cut.CheckIfParameterCanBeDividedByFive(5);
            int expectedNumber = 5;
            assertThat(p, is(expectedNumber));

       }

       @Test
        public void CheckIfParameterCanBeDividedByThreeAndFive() {
            Parameter p = cut.CheckIfParameterCanBeDividedByThreeAndFive(3, 5);
            System.out.println(p.parameterFive);

            int expectedNumberThree = 3;
            int expectedNumberFive = 5;

             assertThat(p.parameterThree, is(expectedNumberThree));
             assertThat(p.parameterFive, is(expectedNumberFive));
       }
       @Test
        public void CheckIfParameterCantBeDividedByThreeAndFive() {
           Parameter p = cut.CheckIfParameterCantBeDividedByThreeAndFive(3, 5);
           System.out.println(p.parameterFive);

           int expectedNumberThree = 3;
           int expectedNumberFive = 5;

           assertThat(p.parameterThree, is(expectedNumberThree));
           assertThat(p.parameterFive, is(expectedNumberFive));
       }

    }




