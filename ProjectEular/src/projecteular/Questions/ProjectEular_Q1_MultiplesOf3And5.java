/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

/**
 *
 * @author Tolga
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class ProjectEular_Q1_MultiplesOf3And5 {

    //If we list all the natural numbers below 10 that are multiples of 3 or 5, 
    // we get 3, 5, 6 and 9. The sum of these multiples is 23.
    // Question : Find the sum of all the multiples of 3 or 5 below 1000.
    public static int getSumOfGivenWithGivenMultiples(int number) {
        int calc = 0;
        int multiple1 = 3;
        int multiple2 = 5;
        for(int i = 0 ; i < number ; i++) {
            if( (i % multiple1 == 0) || (i % multiple2 == 0) ) {
                calc += i;
            }
        }
        return calc;
    }
    
}
