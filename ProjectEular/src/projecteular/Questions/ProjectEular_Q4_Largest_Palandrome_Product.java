/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

/**
 *
 * @author Tolga
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class ProjectEular_Q4_Largest_Palandrome_Product {
    
    public static int getMaxPalendromWithThree() { 
        int max = 999*999;
        int min = 100*100;
        
        for(int i = max ; i > min ; i--) {
            if(isPalendrom(String.valueOf(i)) && isCorrectDiv(i)) {
                return i;
            }
        }
        return 0;
    }
    
    public static boolean isCorrectDiv(int i) {
        for(int k = 999; k > 100 ; k--) {
            if((i % k == 0)) {
                return String.valueOf(i / k).length() == 3;
            }
        }
        return false;
    }
    
    public static boolean isPalendrom(String s) {
        StringBuilder temp = new StringBuilder(s);
        StringBuilder temp2 = temp.reverse();
        return temp2.toString().equals(s);
    }
    
}
