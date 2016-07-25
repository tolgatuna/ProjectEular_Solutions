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
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 */
public class ProjectEular_Q7_Find_Prime {
    
    public static long getPrimeNumber(int order) {
        List<Long> list = new ArrayList<>();
        long prime = 2L;
        
        while(true) {
            if(order == list.size()) {
                return list.get(list.size()-1);
            }
            
            if(isPrime(prime, list)) {
                list.add(prime);
            }
            ++prime;
        }
    }
    
    // Question 10'da Trial Test var ve daha verimli çalışmakta : 
    public static boolean isPrime(long number, List<Long> list) {
        for(long p : list) {
            if(number % p == 0)
                return false;
        }
        return true;
    }
}
