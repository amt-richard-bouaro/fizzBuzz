package com.amalitech.input;

import java.util.Scanner;

public class UserUserInput implements UserInputProvider {
    private final Scanner scanner;
    
    public UserUserInput(Scanner scanner) {
        this.scanner = scanner;
    }
    
    @Override
    public int getUserInput(String prompt) {
        int receivedInput = 0;
        System.out.println(prompt);
        try {
            receivedInput = scanner.nextInt();
            return receivedInput;
        } catch (Exception e) {
            scanner.next();
            System.out.println("Try again! This time enter valid number");
            getUserInput(prompt);
        }
        
        return receivedInput;
    }
}
