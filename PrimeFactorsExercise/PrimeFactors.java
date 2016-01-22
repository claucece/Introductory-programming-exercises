/**
 * Prime Factors Exercise
 * Write a method generate(int n) that given an integer N will return a list of 
 * integers such that the numbers are the factors of N and are arranged in 
 * increasing numerical order.
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Let's print the prime factors of a number:");
        PrimeFactors factors = new PrimeFactors();
        factors.generateList(40);
    }

    private List<Integer> generateList(int n) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        System.out.println("The Prime List of " + n + ":");
        getList(primeList, n);
        return primeList;
    }

    public List<Integer> getList(ArrayList<Integer> primeList, int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeList.add(i);
                n /= i;
            }
        }
        System.out.println(primeList);
        return primeList;
    }
   
}
