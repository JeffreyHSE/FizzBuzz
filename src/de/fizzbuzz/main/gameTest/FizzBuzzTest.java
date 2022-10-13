package de.fizzbuzz.main.gameTest;

import de.fizzbuzz.main.game.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {

    private final FizzBuzz cut = new FizzBuzz();

        @Test
         public void checkIfNumberIsValid() throws Exception {
            cut.calculate(50);
       }

       @Test(expected = Exception.class)
       public void checkIfNumberIsInvalid() throws Exception {
           cut.calculate(101);
       }

       @Test
        public void checkIfParameterCanBeDividedByThree() throws Exception {
           String parameter = cut.calculate(6);
           String expectedOutput = "Fizz";
           assertThat(parameter, is(expectedOutput));
       }

       @Test
        public void checkIfParameterCanBeDividedByFive() throws Exception {
            String parameter = cut.calculate(5);
            String expectedOutput = "Buzz";
            assertThat(parameter, is(expectedOutput));

       }

       @Test
        public void checkIfParameterCanBeDividedByThreeAndFive() throws Exception {
           String parameter = cut.calculate(15);
            String expectedOutput = "FizzBuzz";
            assertThat(parameter, is(expectedOutput));
       }

       @Test
        public void checkIfParameterCantBeDividedByThreeAndFive() throws Exception {
           String parameter = cut.calculate(17);
           String expectedOutput = FizzBuzz.returnValue;
           assertThat(parameter, is(expectedOutput));
       }

    }