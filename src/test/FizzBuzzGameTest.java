package test;


import com.amalitech.FizzBuzzGame.FizzBuzzGame;
import com.amalitech.input.UserUserInput;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class FizzBuzzGameTest {
    @Test
    public void testGetUserInputWithValidInput() {
        
        String userInput = "50\n"; // Simulate user input of 50
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        
        Scanner scanner = new Scanner(System.in);
        UserUserInput input = new UserUserInput(scanner);
        
        int result = input.getUserInput(userInput);
        
        // Assert
        assertEquals(50, result);
        
       
    }
    
    @Test
    public void testThatPlayMethodReturnsCorrectResult() {
        
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        
        int testValue1 = 3;
        int testValue2 = 15;
        int testValue3 = 8;
        
        String result1 = fizzBuzzGame.play(testValue1);
        String result2 = fizzBuzzGame.play(testValue2);
        String result3 = fizzBuzzGame.play(testValue3);
        
        assertEquals("Buzz", result1);
        assertEquals("FizzBuzz", result2);
        assertEquals("8", result3);
        
        
    }
}
