package org.factoriaftest5.examplefizz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExamplefizzTest {
    
    
        
    
        // Scenario 1: Given a number divisible by 3, return "Fizz"
        @Test
        public void testFizz() {
            Examplefizz examplefizz = new Examplefizz();
            // Given
            int number = 3;
            // When
            String result = examplefizz.fizzbuzz(number);
            // Then
            assertEquals("Fizz", result);
        }
    
        // Scenario 2: Given a number divisible by 5, return "Buzz"
        @Test
        public void testBuzz() {
            Examplefizz examplefizz = new Examplefizz();
            // Given
            int number = 5;
            // When
            String result = examplefizz.fizzbuzz(number);
            // Then
            assertEquals("Buzz", result);
        }
    
        // Scenario 3: Given a number divisible by 3 and 5, return "FizzBuzz"
        @Test
        public void testFizzBuzz() {
            Examplefizz examplefizz = new Examplefizz();
            // Given
            int number = 15;
            // When
            String result = examplefizz.fizzbuzz(number);
            // Then
            assertEquals("FizzBuzz", result);
        }
    
        // Scenario 4: Given a number not divisible by 3 or 5, return the number as string
        @Test
        public void testNumber() {
            Examplefizz examplefizz = new Examplefizz();
            // Given
            int number = 7;
            // When
            String result = examplefizz.fizzbuzz(number);
            // Then
            assertEquals("7", result);

        }
    // Test para los números divisibles por 3
    @Test
    public void testFizzForDivisibleByThree() {
        Examplefizz example = new Examplefizz(); 
        // Given
        int number = 3; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("Fizz", result); // Comprobar que el resultado es "Fizz"
    }

    // Test para los números divisibles por 5
    @Test
    public void testBuzzForDivisibleByFive() {
        Examplefizz example = new Examplefizz(); 
        // Given
        int number = 5; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("Buzz", result); // Comprobar que el resultado es "Buzz"
    }

    // Test para los números divisibles por 15
    @Test
    public void testFizzBuzzForDivisibleByBoth() {
        Examplefizz example = new Examplefizz(); 
        // Given
        int number = 15; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("FizzBuzz", result); // Comprobar que el resultado es "FizzBuzz"
    }

    // Test para números que contienen el dígito 3
    @Test
    public void testFizzForContainingThree() {
        Examplefizz example = new Examplefizz();
        // Given
        int number = 13; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("Fizz", result); // Comprobar que el resultado es "Fizz"
    }

    // Test para números que contienen el dígito 5
    @Test
    public void testBuzzForContainingFive() {
        Examplefizz example = new Examplefizz();
        // Given
        int number = 25; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("Buzz", result); // Comprobar que el resultado es "Buzz"
    }

    // Test para números que no cumplen con ninguna condición
    @Test
    public void testNumberWithoutFizzBuzz() {
        Examplefizz example = new Examplefizz();
        // Given
        int number = 7; // Número a probar
        
        // When
        String result = example.alternativefizzbuzz(number); // Ejecutar el método
        
        // Then
        assertEquals("7", result); // Comprobar que el resultado es el número en sí
    }
}
    
    
    

