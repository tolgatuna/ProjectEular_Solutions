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
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
 * The first ten terms would be:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers:
 * 
 *  1: 1
 *  3: 1,3
 *  6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred divisors?
 * 
 */
public class ProjectEular_Qu12_Highly_Diivisible_triangular_number {
    
    public static Long getHiglyDivisibleTriangularNumber(int maxDivisor) {
        long adder = 2L;
        for(long l = 2L; ; l += adder++) {
            if(getDivisibleCount(l) > maxDivisor) {
                return l;
            }
        }
    }
    
    public static int getDivisibleCount(long number) {
        int count = 0;
        long sqrti = (long)Math.sqrt(number);
            
        for(int j = 1; j <= sqrti; j++) {
            if(sqrti % j == 0) {
                count+=2;
            }
            // Is perfect squared : 
            if((long)Math.pow(sqrti, 2) == number)
                count--;
        }
        return count;
    }
}
