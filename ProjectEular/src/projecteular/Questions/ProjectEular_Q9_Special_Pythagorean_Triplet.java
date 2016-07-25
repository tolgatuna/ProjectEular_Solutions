package projecteular.Questions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tolga
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class ProjectEular_Q9_Special_Pythagorean_Triplet {
    
    public static int calculateTriplet(int sum) {
        for (int b = 0 ; b <= sum ; b++) {
            for(int a = 0 ; a < b ; a++) {
                double c = Math.sqrt(a*a + b*b);
                if(a + b + c == 1000) {
                    return (int) (a*b*c);
                } 
            }
        }
        return 0;
    }
    
}
