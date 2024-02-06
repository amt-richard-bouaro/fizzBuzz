package com.amalitech;

import com.amalitech.FizzBuzzGame.FizzBuzzGame;
import com.amalitech.input.UserUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        UserUserInput userUserInput = new UserUserInput(scanner);
        
        String promptUserToEnterNumber = "Please enter your number:";
        int number = userUserInput.getUserInput(promptUserToEnterNumber);
        
       String outcome =  new FizzBuzzGame().play(number);
        
        System.out.println("Result: " + outcome);
        
    }
}