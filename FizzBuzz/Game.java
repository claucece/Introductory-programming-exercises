/**
 * FizzBuzz Exercise
 * FizzBuzz is a simple number game where you count, but say "Fizz" 
 * and/or "Buzz" instead of numbers adhering to certain rules.
 * Create a FizzBuzz() method that prints out the numbers 1 through 100.
 * Instead of numbers divisible by three print "Fizz".
 * Instead of numbers divisible by five print "Buzz".
 * Instead of numbers divisible by three and five print "FizzBuzz".
 */

public class Game {
    public static void main(String[] args) {
        System.out.println("Let's play the game of BizzFuzz:");
        Game count = new Game();
        count.fizzBuzz();
    }

    private void fizzBuzz() {
       for (int i = 1; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("Fizz Buzz");
           } else if (i % 5 == 0) {
               System.out.println("Buzz");
           } else if (i % 3 == 0) {
               System.out.println("Fizz"); 
           } else {
               System.out.println(i);
           }
       } 
    }

}
