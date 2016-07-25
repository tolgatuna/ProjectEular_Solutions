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
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class ProjectEular_Q3_Largest_Prime_Factor {
    
    public static int getLargestPrimeFactor(long number) {
        List<Integer>list = new ArrayList<>();
        
        long last = number;
        for(int i = 2; i <= number ; i++) {
            if(isPrime(i, list))
            {
                list.add(i);
                last = getLastDivResultForGivenPrime(last, i);
                if(last == 1) {
                    break;
                }
            }
        }
        
        return list.get(list.size()-1);
    }
    
    public static boolean isPrime(long number, List<Integer> list) {
        for(int p : list) {
            if(number % p == 0)
                return false;
        }
        return true;
    }
    
    public static long getLastDivResultForGivenPrime(long number,  long prime) {
        if(number % prime == 0)
            return getLastDivResultForGivenPrime(number/prime, prime);
        else
            return number;
    }
    
}
