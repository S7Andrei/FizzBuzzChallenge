package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String[] expectedResults = {
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        };

        for (int i = 1; i <= 15; i++) {
            assertEquals(expectedResults[i - 1], fizzBuzz.getFizzBuzzValue(i));
        }
    }
}