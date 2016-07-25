/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteular.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tolga
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class ProjectEular_Q5_Smallest_Multiple {
    
    // Verilen maximum için 1 - max arası sayıların ekokunu hesaplayan funk : 
    // Örn : 10 verdin 1-2-3-4-5-6-7-8-9-10 ekoku : 1*2*3*2*5*7*2*3 = 2^3 * 3^2 * 5 * 7 = 2520
    // Daha iyi anlamak için EKOK tanımına bakılmalı.
    public static long getMinimum(long max) {
        // Öncelikle Asal sayıları bir listeye topladık : 
        List<Long> list = getPrimeNumbers(max);
        Map<Long,Long> map = new HashMap<>();
        
        // Asal sayıların katlarını bulmak üzere map'te katları 0 vererek işleme döktük.
        for(long i : list) {
            map.put(i, 0L);
        }
        
        // Verilen max'dan itibaren geriye doğru her bir sayının, içerisinde yer alan asal sayıları karşılaştırarak
        // en büyük asal sayı katlarını tutmayı sağladık. Yani 2'den 3 tane 3'ten x tane var şekline getirdik.
        for(long i = max ; i > 1; i--) {
            for(long key : map.keySet()) {
                if(map.get(key) < getPrimeCount(i, key, 0))
                    map.put(key, getPrimeCount(i, key, 0));
            }
        }
                
        // En sonda ilgili asal sayı ve ilgili katını kullanarak 2^3 * 3^2 * 5 * 7 işlemini yaptık.
        int calc = 1;
        for(long key : map.keySet()) {
            for(long i = 0L; i < map.get(key); i++) {
                calc *=key;
            }
        }
        
        return calc;
    }
    
    // Asal sayıları bul : 
    public static List<Long> getPrimeNumbers(long max) {
        List<Long> list = new ArrayList<>();
        boolean check;
        for(long i = max ; i > 1 ; i--) {
            check = true;
            for(long k = i - 1 ; k > 1 ; k--) {
                if(i % k == 0) {
                    check = false;
                    break;
                }
            }
            if(check)
                list.add(i);
        }
        return list;
    }
    
    // Verilen number içerisinde verilen prime(asal) sayıdan kaç tane bulduğunu hesaplayan funk.
    public static long getPrimeCount(long number, long prime, int count) {
        if(number % prime == 0) {
            return (long)getPrimeCount(number / prime, prime, ++count);
        }
        else
            return count;
    }
    
}
