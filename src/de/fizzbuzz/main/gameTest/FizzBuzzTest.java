package de.fizzbuzz.main.gameTest;

import de.fizzbuzz.main.game.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {

    private final FizzBuzz cut = new FizzBuzz();

        @Test
         public void checkIfNumberIsValid() throws Exception {
            cut.checkIfNumberToHighOrToLow(50);
       }

       @Test(expected = Exception.class)
       public void checkIfNumberIsInvalid() throws Exception {
           cut.checkIfNumberToHighOrToLow(101);
       }

       @Test
        public void checkIfParameterCanBeDividedByThree() {
           String parameter = cut.checkIfParameterCanBeDividedByThree(6);
           String expectedOutput = "Fizz";
           assertThat(parameter, is(expectedOutput));
       }

       @Test
        public void checkIfParameterCanBeDividedByFive() {
            String parameter = cut.checkIfParameterCanBeDividedByFive(5);
            String expectedOutput = "Buzz";
            assertThat(parameter, is(expectedOutput));

       }

       @Test
        public void checkIfParameterCanBeDividedByThreeAndFive() {
            String parameter = cut.checkIfParameterCanBeDividedByThreeAndFive(15);
            String expectedOutput = "FizzBuzz";
            assertThat(parameter, is(expectedOutput));
       }


       @Test
        public void checkIfParameterCantBeDividedByThreeAndFive() {
           int parameter = cut.checkIfParameterCantBeDividedByThreeAndFive(7);
           int unexpectedOutput = 0;
           assertThat(parameter, is(unexpectedOutput));
       }

    }