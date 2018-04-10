Requirement

---

A pair of numbers (a,b) are said to be amicable if the proper divisors of one sum to the other. The smallest pair of amicable numbers is (220, 284). They are
amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284; and the proper divisors of
284 are 1, 2, 4, 71 and 142, of which the sum is 220.

1) We need a java function named isAmicable( Integer x, Integer y ) that determines if a pair of numbers have this property. Please write the method
signature(s) and javadocs for all functions we will need to accomplish this. The methods should all be public. Put simply: how would you break down this problem
 into constituent parts? We intend to use your documentation to trivially write isAmicable( Integer x, Integer y ). Function bodies are not necessary;
 just provide the interface.

2) Please write the unit tests for your functions. Function bodies are required for this part.

===

Notes:
    c.p.s.AmicablePairUtil
        contains the specified method: isAmicable(...)
        contains a generator method for amicable pairs

    c.p.s.AmicableTester
        Junit test class in the same package (under test/java)
