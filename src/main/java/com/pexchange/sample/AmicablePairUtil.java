package com.pexchange.sample;

import java.util.HashSet;
import java.util.Set;

/**
 * Entry point for our example code
 * <p>
 * See isAmicable(Integer, Integer)
 */
public class AmicablePairUtil {
    
    /**
     * Determines if two Integers are amicable
     * <p>
     * A pair of numbers (a,b) are said to be amicable if the proper divisors of one sum to the other. The smallest pair of amicable numbers is (220, 284).
     * They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284; and the proper divisors of
     * 284 are 1, 2, 4, 71 and 142, of which the sum is 220.
     *
     * @param x
     * @param y
     * @return true if amicable
     */
    public static boolean isAmicable(Integer x, Integer y) {
        
        return sumDivisors(x) == y && sumDivisors(y) == x;
    }
    
    /**
     * Add all divisors of the parameter x
     *
     * @param x
     * @return sum of all divisors of x
     */
    public static int sumDivisors(Integer x) {
        
        Integer total = 0;
        
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                total += i;
            }
        }
        
        return total;
    }
    
    /**
     * Iterative solution to find pairs
     *  @param startX
     * @param endX
     */
    public static Set<Integer> getAmicablePairLowerValues(int startX, int endX) {
        
        Set<Integer> foundLowerValues = new HashSet<>();
        
        for (int i = startX; i < endX; i++) {
            
            int divisorSum = sumDivisors(i);
            
            if (i != divisorSum && !foundLowerValues.contains(divisorSum) && sumDivisors(divisorSum) == i) {
                foundLowerValues.add(i);
            }
        }
        return foundLowerValues;
    }
    
}
