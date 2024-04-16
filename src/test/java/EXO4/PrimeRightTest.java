package EXO4;

import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO4.PrimeRight;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeRightTest {

    @Test
    void isPrime_whenInputIsLessThanTwo_thenReturnFalse() {
        boolean result = PrimeRight.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsOne_thenReturnFalse() {
        boolean result = PrimeRight.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsTwo_thenReturnTrue() {
        boolean result = PrimeRight.isPrime(2);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsThree_thenReturnTrue() {
        boolean result = PrimeRight.isPrime(3);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsFour_thenReturnFalse() {
        boolean result = PrimeRight.isPrime(4);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsSixteen_thenReturnFalse() {
        boolean result = PrimeRight.isPrime(16);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsThirtyTwo_thenReturnFalse() {
        boolean result = PrimeRight.isPrime(32);
        assertFalse(result);
    }

}