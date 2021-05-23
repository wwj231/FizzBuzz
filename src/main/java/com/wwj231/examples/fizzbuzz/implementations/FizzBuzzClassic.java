package com.wwj231.examples.fizzbuzz.implementations;

import com.wwj231.examples.fizzbuzz.FizzBuzz;
import com.wwj231.examples.fizzbuzz.util.FizzBuzzUtil;

public class FizzBuzzClassic implements FizzBuzz {

    public void print(final int from, final int to) {
        for(int i = from; i<=to; i++){
            var check = FizzBuzzUtil.checkFizzBuzz(i);
            if(check.isPresent()) {
                System.out.println(i + " - " + check.get().getDescription());
            }
        }
    }
}
