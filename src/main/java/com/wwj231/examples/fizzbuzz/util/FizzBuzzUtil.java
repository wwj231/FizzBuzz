package com.wwj231.examples.fizzbuzz.util;

import com.wwj231.examples.fizzbuzz.model.FizzBuzzEnum;

import java.util.Optional;

public class FizzBuzzUtil {
    public static Optional<FizzBuzzEnum> checkFizzBuzz(final int i) {
        if(i%3==0 && i%5==0){
            return Optional.of(FizzBuzzEnum.FIZZ_BUZZ);
        }
        if(i%3==0){
            return Optional.of(FizzBuzzEnum.FIZZ);
        }
        if (i%5==0){
            return Optional.of(FizzBuzzEnum.BUZZ);
        }
        return Optional.empty();
    }
}
