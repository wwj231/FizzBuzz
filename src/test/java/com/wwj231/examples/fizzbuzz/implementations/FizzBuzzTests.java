package com.wwj231.examples.fizzbuzz.implementations;

import com.wwj231.examples.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTests {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void fizzBuzzClassicTest() {
        int from = 0;
        int to = 15;
        FizzBuzz fizzBuzz = new FizzBuzzClassic();
        fizzBuzz.print(from, to);
        String test = "0 - FizzBuzz\n" +
                "3 - Fizz\n" +
                "5 - Buzz\n" +
                "6 - Fizz\n" +
                "9 - Fizz\n" +
                "10 - Buzz\n" +
                "12 - Fizz\n" +
                "15 - FizzBuzz";

        assertEquals(test, outputStreamCaptor.toString().trim());
    }

    @Test
    void fizzBuzzForEachLoopTest() {
        int from = 0;
        int to = 15;
        FizzBuzz fizzBuzz = new FizzBuzzForEachLoop();
        fizzBuzz.print(from, to);
        String test = "0 - FizzBuzz\n" +
                "3 - Fizz\n" +
                "5 - Buzz\n" +
                "6 - Fizz\n" +
                "9 - Fizz\n" +
                "10 - Buzz\n" +
                "12 - Fizz\n" +
                "15 - FizzBuzz";

        assertEquals(test, outputStreamCaptor.toString().trim());
    }

    @Test
    void fizzBuzzStreamTest() {
        int from = 0;
        int to = 15;
        FizzBuzz fizzBuzz = new FizzBuzzStream();
        fizzBuzz.print(from, to);
        String test = "0 - FizzBuzz\n" +
                "3 - Fizz\n" +
                "5 - Buzz\n" +
                "6 - Fizz\n" +
                "9 - Fizz\n" +
                "10 - Buzz\n" +
                "12 - Fizz\n" +
                "15 - FizzBuzz";

        assertEquals(test, outputStreamCaptor.toString().trim());
    }
}