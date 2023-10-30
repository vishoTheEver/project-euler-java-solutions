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

    @Test
    void multiplesOf3or5() {
        assertEquals(problems.multiplesOf3or5(10), 23);
        assertEquals(problems.multiplesOf3or5(1000), 233168);
    }
}