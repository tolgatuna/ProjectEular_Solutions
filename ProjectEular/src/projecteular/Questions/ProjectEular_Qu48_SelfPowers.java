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
 * 
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * 
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
public class ProjectEular_Qu48_SelfPowers {
    public static String getLastTeenDigits (int lastNumber) {
        BigInteger b = new BigInteger("0");
        for ( BigInteger i = new BigInteger("1") ; i.compareTo(new BigInteger(String.valueOf(lastNumber))) != 1 ; i=i.add(BigInteger.ONE) ) {
            b = b.add(i.pow(Integer.valueOf(i.toString())));
        }
        System.out.println(b.toString());
        if(b.toString().length() > 10)
            return b.toString().substring(b.toString().length()-10);
        return b.toString();
    }
}
