/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

/**
 *
 * @author Tolga
 */
public class ProjectEular_Q6_Sum_Square_Difference {
    
    public static int calculateSumSquareDif(int value) {
        int sumOfSquares = 0;
        int sumOfNumbers = 0;
        for(int i = 0 ; i <= value; i++ ) {
            sumOfNumbers += i;
            sumOfSquares += Math.pow(i, 2);
        }
        
        return (int)(Math.pow(sumOfNumbers, 2) - sumOfSquares);
    }

}

