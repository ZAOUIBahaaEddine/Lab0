package EXO4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO4.PrimeWrong;

class PrimeWrongTest {

    @Test
    void isPrime_whenInputIsLessThanTwo_thenReturnFalse() {
        boolean result = PrimeWrong.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsOne_thenReturnFalse() {
        boolean result = PrimeWrong.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsTwo_thenReturnTrue() {
        boolean result = PrimeWrong.isPrime(2);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsThree_thenReturnTrue() {
        boolean result = PrimeWrong.isPrime(3);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsFour_thenReturnFalse() {
        boolean result = PrimeWrong.isPrime(4);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsSixteen_thenReturnFalse() {
        boolean result = PrimeWrong.isPrime(16);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsThirtyTwo_thenReturnFalse() {
        boolean result = PrimeWrong.isPrime(32);
        assertFalse(result);
    }

}