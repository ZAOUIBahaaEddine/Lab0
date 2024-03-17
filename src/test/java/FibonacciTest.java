
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.Fibonacci;


public class FibonacciTest {
    private Fibonacci Fibo;

    @BeforeEach
    void setUp (){
        Fibo = new Fibonacci();
    }
    @Test
    public void FibonacciFornEqualsZeroTest() {

        int n0 = 0;
        int expected0 = 0;
        int actual0 = Fibo.fibonacci(n0);
        Assertions.assertEquals(expected0, actual0);
    }

    @Test
    public void FibonacciFornEqualsOneTest() {

        int n1 = 1;
        int expected1 = 1;
        int actual1 = Fibo.fibonacci(n1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void FibonacciFornEqualsTwoTest() {
        int n2 = 2;
        int expected2 = 1;
        int actual2 = Fibo.fibonacci(n2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void FibonacciFornEqualsThreeTest() {
        int n3 = 3;
        int expected3 = 2;
        int actual3 = Fibo.fibonacci(n3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void FibonacciFornEqualsFourTest() {
        int n4 = 4;
        int expected4 = 3;
        int actual4 = Fibo.fibonacci(n4);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    public void FibonacciFornEauqlsFiveTest() {

        int n5 = 5;
        int expected5 = 5;
        int actual5 = Fibo.fibonacci(n5);
        Assertions.assertEquals(expected5, actual5);
    }

    @Test
    public void FibonacciFornLessThanZeroTest() {
        int nNeg = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> Fibo.fibonacci(nNeg));
    }

    // This code worked for small numbers.
    // Recursively, it'll work for big numbers

}
