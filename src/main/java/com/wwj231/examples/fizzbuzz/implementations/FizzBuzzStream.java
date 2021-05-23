package com.wwj231.examples.fizzbuzz.implementations;

import com.wwj231.examples.fizzbuzz.FizzBuzz;
import com.wwj231.examples.fizzbuzz.util.FizzBuzzUtil;

import java.util.stream.IntStream;

public class FizzBuzzStream implements FizzBuzz {
    @Override
    public void print(final int from, final int to) {
        IntStream.rangeClosed(from, to)
                .forEach(i -> FizzBuzzUtil.checkFizzBuzz(i)
                        .ifPresent(fizzBuzzEnum -> System.out.println(i + " - " + fizzBuzzEnum.getDescription())));


    }
}
