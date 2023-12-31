import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    // This will be the shared instance across all test methods
    private static Problems problems;

    @BeforeAll
    public static void setUp() {
        problems = new Problems();
    }

    // Problem 1: Multiples of 3 or 5
    @Test
    void test_multiplesOf3or5() {
        assertEquals(23, problems.multiplesOf3or5(10));
        assertEquals(233168, problems.multiplesOf3or5(1000));
    }

    // Problem 2: Even Fibonacci Numbers
    @Test
    void test_evenFibonacciNumbers() {
        assertEquals(10, problems.evenFibonacciNumbers(10));
        assertEquals(4613732, problems.evenFibonacciNumbers(4000000));
    }

    // Problem 3: Largest Prime Factor
    @Test
    void test_largestPrimeFactor() {
        assertEquals(29, problems.largestPrimeFactor(13195));
        assertEquals(6857, problems.largestPrimeFactor(600851475143L));
    }

    // Problem 4: Largest Palindrome Product
    @Test
    void test_largestPalindromeProduct(){
        assertEquals(9009, problems.largestPalindromeNumber(2));
        assertEquals(906609, problems.largestPalindromeNumber(3));
    }

    // Problem 5: Smallest Multiple
    @Test
    void test_smallestMultiple(){
        assertEquals(2520, problems.smallestMultiple(1,10));
        assertEquals(232792560, problems.smallestMultiple(1,20));
    }

    // Problem 6: Sum Square Difference
    @Test
    void test_sumSquareDifference(){
        assertEquals(2640, problems.sumSquareDifference(1,10));
        assertEquals(25164150, problems.sumSquareDifference(1,100));
    }

    // Problem 7: 10001st Prime
    @Test
    void test_10001stPrime(){
        assertEquals(13, problems.prime10001st(6));
        assertEquals(104743, problems.prime10001st(10001));
    }

    // Problem 9: Special Pythagoras Triplet
    @Test
    void test_specialPythagorasTriplet(){
        assertEquals(31875000, problems.specialPythagorasTriplet());
    }

    // Problem 16: Power Digit Sum
    @Test
    void test_powerDigitSum(){
        assertEquals(26, problems.powerDigitSum(15));
        assertEquals(1366, problems.powerDigitSum(1000));
    }
}
