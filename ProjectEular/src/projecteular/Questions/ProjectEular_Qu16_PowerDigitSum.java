/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

import java.math.BigInteger;

/**
 *
 * @author Tolga
 */
public class ProjectEular_Qu16_PowerDigitSum {
    public static int getPowerDigitSum(int pow) {
        BigInteger res = new BigInteger("2");
        res = res.pow(pow);
        
        int sum = 0;
        for(int i = 0 ; i<res.toString().length() ; i++)
            sum+= Character.getNumericValue(res.toString().charAt(i));
        
        return sum;
    }
}
