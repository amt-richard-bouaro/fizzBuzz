package com.amalitech.FizzBuzzGame;

public class FizzBuzzGame implements FizzBuzzGameProvider {
    
    @Override
    public String play(int number) {
        
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
