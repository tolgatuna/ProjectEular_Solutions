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
 * The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class ProjectEular_Qu14_Longest_Collatz_Sequence {
    
    public static long getCollatzSequenceStart(long seqCount) {
        System.out.println("projecteular.Questions.ProjectEular_Qu14_Longest_Collatz_Sequence.getCollatzSequenceStart()");
        
        long maxCount = 0L;
        long max = 0L;
        for (long l = 2L ; l < seqCount ; l++) {
            if(maxCount < getCollatzCount(l)) {
                maxCount = getCollatzCount(l);
                max = l;
            }
        }
        return max;
    }
    
    public static long getCollatzCount(long number) {
        int count = 1 ; 
        while ( (getNextCollatzNumber(number) != 1) && (getNextCollatzNumber(number) != 0)) {
            number = getNextCollatzNumber(number);
            count++;
        }
        return count;
    }
    
    public static long getNextCollatzNumber(long number) {
        // EVEN :
        if(number % 2 == 0)
            return number / 2;
        
        // ODD :
        return 3*number + 1;
    }
}
