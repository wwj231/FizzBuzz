package com.wwj231.examples.fizzbuzz;

import com.wwj231.examples.fizzbuzz.implementations.FizzBuzzClassic;
import com.wwj231.examples.fizzbuzz.implementations.FizzBuzzForEachLoop;
import com.wwj231.examples.fizzbuzz.implementations.FizzBuzzStream;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzzClassic();
        fizzBuzz.print(0, 15);
        fizzBuzz = new FizzBuzzForEachLoop();
        fizzBuzz.print(0,15);
        fizzBuzz = new FizzBuzzStream();
        fizzBuzz.print(0, 15);
    }
}
