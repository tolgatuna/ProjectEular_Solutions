/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tolga
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
 * The use of "and" when writing out numbers is in compliance with British usage.
 */
public class ProjectEular_Qu17_NumberLetterCount {
    public static Map <Integer, String> numbers;

    static {
        numbers = new HashMap<>();
        numbers.put(1,  "one");
        numbers.put(2,  "two");
        numbers.put(3,  "three");
        numbers.put(4,  "four");
        numbers.put(5,  "five");
        numbers.put(6,  "six");
        numbers.put(7,  "seven");
        numbers.put(8,  "eight");
        numbers.put(9,  "nine");
        numbers.put(10, "ten");
        numbers.put(11, "eleven");
        numbers.put(12, "twelve");
        numbers.put(13, "thirteen");
        numbers.put(14, "fourteen");
        numbers.put(15, "fifteen");
        numbers.put(16, "sixteen");
        numbers.put(17, "seventeen");
        numbers.put(18, "eighteen");
        numbers.put(19, "nineteen");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        numbers.put(50, "fifty");
        numbers.put(60, "sixty");
        numbers.put(70, "seventy");
        numbers.put(80, "eighty");
        numbers.put(90, "ninety");
        numbers.put(100, "hundred");
        numbers.put(1000, "thousand");
    }
    
    public static int getSumOfNumLetterCount(int start, int end) {
        int sum = 0;
        for (int i = start ; i <= end ; i++) {
            sum += getCount(getString(i));
        }
        return sum;
    }
    
    public static int getCount(String s){
        s = s.replace(" ", "");
        s = s.replace("-", "");
        return s.length();
    }
    
    public static String getString (int number) {
        if(number == 0) {
            return "";
        }
        if(number <= 20) {
            return numbers.get(number);
        }
        else if(number < 100) {
            if(number % 100 == 0)
                return numbers.get(number);
            return numbers.get(number - (number % 10)) + "-" +getString((number % 10));
        }
        else if(number < 1000) {
            if(number % 100 == 0)
                return numbers.get(number/100)+ " " + numbers.get(100);
            return numbers.get(number/100)+ " " + numbers.get(100) + " and " +getString(number%100);
        }
        else if(number < 1000000) {
            if(number % 1000 == 0)
                return numbers.get(number/1000) + " " + numbers.get(1000);
            return numbers.get(number/1000) + " " + numbers.get(1000) + " "+ getString(number % 1000);
        }
        return "";
    }
    
    
    
    
}
