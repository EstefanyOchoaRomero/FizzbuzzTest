package org.factoriaftest5.examplefizz;

public class Examplefizz {

    public static void main(String[] args) {
        Examplefizz example = new Examplefizz();
        example.runFizzBuzz();
    }

    public void runFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(alternativefizzbuzz(i));  // Cambié fizzbuzz(i) a alternativefizzbuzz(i)
        }
    }

    public String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public String alternativefizzbuzz(int number) {
        
        String numberStr = String.valueOf(number);
        boolean containsThree = numberStr.contains("3");
        boolean containsFive = numberStr.contains("5");

     
        if (number % 3 == 0 || number % 5 == 0 || containsThree || containsFive) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz"; // Divisible por 3 y 5
            } else if (number % 3 == 0 || containsThree) {
                return "Fizz"; // Divisible por 3 o contiene 3
            } else if (number % 5 == 0 || containsFive) {
                return "Buzz"; // Divisible por 5 o contiene 5
            }
        }
        return String.valueOf(number); // Si no cumple ninguna condición
    }
}
