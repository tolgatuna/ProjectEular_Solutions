/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tolga
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 */
public class ProjectEular_Qu10_Summation_of_primes {
    
    public static long getPrimeSummation(long max) {
        long sum = 0l;

        for (long i = 2L ; i < max ; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static boolean isPrime(long number) {
        for(long i = 2L ; i <= (int)(Math.sqrt(number)) ; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    
}
