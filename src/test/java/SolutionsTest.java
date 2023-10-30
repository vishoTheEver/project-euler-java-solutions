import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    // This will be the shared instance across all test methods
    private static Problems problems;

    @BeforeAll
    public static void setUp(){
        problems = new Problems();
    }

    // Problem 1: Multiples of 3 or 5
    @Test
    void test_multiplesOf3or5() {
        assertEquals(problems.multiplesOf3or5(10), 23);
        assertEquals(problems.multiplesOf3or5(1000), 233168);
    }

    // Problem 2: Even Fibonacci Numbers
    @Test
    void test_evenFibonacciNumbers(){
        assertEquals(problems.evenFibonacciNumbers(10), 10);
        assertEquals(problems.evenFibonacciNumbers(4000000),4613732);
    }
}