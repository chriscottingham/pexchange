package com.pexchange.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test our AmicablePairUtil method(s)
 */
public class AmicableTester {
    
    /**
     * I like enums for static data which won't change any more often than compilation - it gives type safety and makes things obvious, even if it takes a
     * little longer to set up.  If external files are used, there's the parsing overhead, and the wrangling of the data if it doesn't parse correctly.
     * Obviously, if you need a pluggable set of input data, then you need external files.
     */
    public enum AmicableTestValue {
        FIRST(220, 284, true),        //known amicable values
        SECOND(1087, 1091, false),        //two primes
        THIRD(2459, 500, false),        //prime and not-prime
        FOURTH(6232, 6368, true)        ;
        
        private int x;
        private int y;
        private boolean amicable;
        
        private AmicableTestValue(int x, int y, boolean amicable) {
            this.x = x;
            this.y = y;
            this.amicable = amicable;
        }
    }
    
    /**
     * Iterate through our fixed values and test for amicability
     */
    @Test
    public void testFixedValues() {
        
        for (AmicableTestValue testValue : AmicableTestValue.values()) {
            
            String message = "Amicable test pair: (" + testValue.x + ", " + testValue.y + ") fails amicable test.  Should be " + testValue.amicable;
            
            Assert.assertTrue(message, AmicablePairUtil.isAmicable(testValue.x, testValue.y) == testValue.amicable);
        }
    }
    
    /**
     * Confirm that the number of found pairs == expected count
     */
    @Test
    public void findAmicablePairs() {
        
        int pairCount = 5;
        Assert.assertTrue("Incorrect number of pairs.  Should be "+pairCount, AmicablePairUtil.getAmicablePairLowerValues(220, 220 + (int) 1e4).size() ==
                pairCount);
    }
}
