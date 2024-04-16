package EXO5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO5.FactorialRight;



public class FactorialRightTest {
    private FactorialRight fact;
    @BeforeEach
    void setUp (){
        fact = new FactorialRight();
    }


    @Test
    void testFactorialTestForZero() {
        int n = 0;
        int expectedResult = 1;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }

    @Test
    void testFactorialTestForOne() {
        int n = 1;
        int expectedResult = 1;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }

    @Test
    void testFactorialTestForTwo() {
        int n = 2;
        int expectedResult = 2;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }

    @Test
    void testFactorialTestForThree() {
        int n = 3;
        int expectedResult = 6;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }

    @Test
    void testFactorialTestForFour() {
        int n = 4;
        int expectedResult = 24;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }
    @Test
    void testFactorialTestForFive() {
        int n = 5;
        int expectedResult = 120;
        int result = fact.factorial(n);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialRight.factorial(-1));
    }

}
