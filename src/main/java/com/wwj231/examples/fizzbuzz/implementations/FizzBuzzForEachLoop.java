package com.wwj231.examples.fizzbuzz.implementations;

import com.wwj231.examples.fizzbuzz.FizzBuzz;
import com.wwj231.examples.fizzbuzz.model.Range;
import com.wwj231.examples.fizzbuzz.util.FizzBuzzUtil;

public class FizzBuzzForEachLoop implements FizzBuzz {
    @Override
    public void print(final int from, final int to) {
        Range range = new Range(from, to);
        for(Integer next :  range){
            FizzBuzzUtil.checkFizzBuzz(next).ifPresent(fizzBuzzEnum -> System.out.println(next + " - " + fizzBuzzEnum.getDescription()));
        }
    }
}
