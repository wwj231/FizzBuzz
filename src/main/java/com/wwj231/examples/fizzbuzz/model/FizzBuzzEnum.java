package com.wwj231.examples.fizzbuzz.model;

public enum FizzBuzzEnum {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz");

    private final String description;

    FizzBuzzEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
