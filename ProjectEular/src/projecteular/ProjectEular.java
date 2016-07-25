/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular;

import projecteular.Questions.ProjectEular_Q1_MultiplesOf3And5;
import projecteular.Questions.ProjectEular_Q2_Even_Fibonacci_Numbers;
import projecteular.Questions.ProjectEular_Q3_Largest_Prime_Factor;
import projecteular.Questions.ProjectEular_Q4_Largest_Palandrome_Product;
import projecteular.Questions.ProjectEular_Q5_Smallest_Multiple;
import projecteular.Questions.ProjectEular_Q6_Sum_Square_Difference;
import projecteular.Questions.ProjectEular_Q7_Find_Prime;
import projecteular.Questions.ProjectEular_Q8_Largest_Product_in_Series;
import projecteular.Questions.ProjectEular_Q9_Special_Pythagorean_Triplet;
import projecteular.Questions.ProjectEular_Qu10_Summation_of_primes;
import projecteular.Questions.ProjectEular_Qu11_Largest_Product_In_Grid;
import projecteular.Questions.ProjectEular_Qu12_Highly_Diivisible_triangular_number;
import projecteular.Questions.ProjectEular_Qu13_LargeSum;
import projecteular.Questions.ProjectEular_Qu14_Longest_Collatz_Sequence;
import projecteular.Questions.ProjectEular_Qu15_LatticePath;
import projecteular.Questions.ProjectEular_Qu16_PowerDigitSum;
import projecteular.Questions.ProjectEular_Qu17_NumberLetterCount;
import projecteular.Questions.ProjectEular_Qu48_SelfPowers;

/**
 *
 * @author Tolga
 */
public class ProjectEular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        //System.out.println(ProjectEular_Q1_MultiplesOf3And5.getSumOfGivenWithGivenMultiples(1000));
        //System.out.println(ProjectEular_Q2_Even_Fibonacci_Numbers.sumEvenFibonacciNumbers(4000000));
        //System.out.println(ProjectEular_Q3_Largest_Prime_Factor.getLargestPrimeFactor(600851475143L));
        //System.out.println(ProjectEular_Q4_Largest_Palandrome_Product.getMaxPalendromWithThree());
        //System.out.println(ProjectEular_Q5_Smallest_Multiple.getMinimum(20));
        //System.out.println(ProjectEular_Q6_Sum_Square_Difference.calculateSumSquareDif(100));
        //System.out.println(ProjectEular_Q7_Find_Prime.getPrimeNumber(10001));
        
        //System.out.println(ProjectEular_Q8_Largest_Product_in_Series.
        //    getMaximumProduct(  "73167176531330624919225119674426574742355349194934"+
        //                        "96983520312774506326239578318016984801869478851843"+
        //                        "85861560789112949495459501737958331952853208805511"+
        //                        "12540698747158523863050715693290963295227443043557"+
        //                        "66896648950445244523161731856403098711121722383113"+
        //                        "62229893423380308135336276614282806444486645238749"+
        //                        "30358907296290491560440772390713810515859307960866"+
        //                        "70172427121883998797908792274921901699720888093776"+
        //                        "65727333001053367881220235421809751254540594752243"+
        //                        "52584907711670556013604839586446706324415722155397"+
        //                        "53697817977846174064955149290862569321978468622482"+
        //                        "83972241375657056057490261407972968652414535100474"+
        //                        "82166370484403199890008895243450658541227588666881"+
        //                        "16427171479924442928230863465674813919123162824586"+
        //                        "17866458359124566529476545682848912883142607690042"+
        //                        "24219022671055626321111109370544217506941658960408"+
        //                        "07198403850962455444362981230987879927244284909188"+
        //                        "84580156166097919133875499200524063689912560717606"+
        //                        "05886116467109405077541002256983155200055935729725"+
        //                        "71636269561882670428252483600823257530420752963450",13 ));
        
        //System.out.println(ProjectEular_Q9_Special_Pythagorean_Triplet.calculateTriplet(1000));
        //System.out.println(ProjectEular_Qu10_Summation_of_primes.getPrimeSummation(2000000));
        
        //int [][] array =  
        //            {
        //                { 8,  2, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91,  8},
        //                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62,  0},
        //                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65},
        //                {52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91},
        //                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
        //                {24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
        //                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
        //                {67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63,  8, 40, 91, 66, 49, 94, 21},
        //                {24, 55, 58,  5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
        //                {21, 36, 23,  9, 75, 00, 76, 44, 20, 45, 35, 14,  0, 61, 33, 97, 34, 31, 33, 95},
        //                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14,  9, 53, 56, 92},
        //                {16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57},
        //                {86, 56,  0, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
        //                {19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40},
        //                { 4, 52,  8, 83, 97, 35, 99, 16,  7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
        //                {88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
        //                { 4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18,  8, 46, 29, 32, 40, 62, 76, 36},
        //                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16},
        //                {20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54},
        //                {01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48}
        //            };
        //System.out.println(ProjectEular_Qu11_Largest_Product_In_Grid.getLargestProduct(array, 4));
        
        //System.out.println(ProjectEular_Qu12_Highly_Diivisible_triangular_number.getHiglyDivisibleTriangularNumber(500));
        
        //System.out.println(ProjectEular_Qu13_LargeSum.getFirstTenDigit());
        
        //System.out.println(ProjectEular_Qu14_Longest_Collatz_Sequence.getCollatzSequenceStart(1000000));
        
        // System.out.println(ProjectEular_Qu15_LatticePath.getLatticePathCount(20, 20));
        
        // System.out.println(ProjectEular_Qu16_PowerDigitSum.getPowerDigitSum(1000));
        
        // System.out.println(ProjectEular_Qu17_NumberLetterCount.getSumOfNumLetterCount(1, 1000));
        
        System.out.println(ProjectEular_Qu48_SelfPowers.getLastTeenDigits(1000));
        
        System.out.println("Calculation Time : " + (System.currentTimeMillis() - start));
    }
    
}
