package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test 
    public void test_fizzbuzz_asign_value_number() {
        KataFizzBuzz myFizz = new KataFizzBuzz(3);
        assertEquals("fizz", myFizz.fizz());
    }

    @Test 
    public void test_fizzbuzz_asign_value_number2() {
        KataFizzBuzz myBuzz = new KataFizzBuzz(5);
        assertEquals("buzz", myBuzz.buzz());
    }

    @Test 
    public void test_fizzbuzz_asign_value_number3() {
        KataFizzBuzz myFizzBuzz= new KataFizzBuzz(5);
        assertEquals("FizzBuzz", myFizzBuzz.fizzBuzz());
    }
    
}


