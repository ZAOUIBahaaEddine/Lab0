import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.Prime;

import org.junit.jupiter.api.Test;

class PrimeTest {

    @Test
    void isPrime_whenInputIsLessThanTwo_thenReturnFalse() {
        boolean result = Prime.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsOne_thenReturnFalse() {
        boolean result = Prime.isPrime(1);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsTwo_thenReturnTrue() {
        boolean result = Prime.isPrime(2);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsThree_thenReturnTrue() {
        boolean result = Prime.isPrime(3);
        assertTrue(result);
    }

    @Test
    void isPrime_whenInputIsFour_thenReturnFalse() {
        boolean result = Prime.isPrime(4);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsSixteen_thenReturnFalse() {
        boolean result = Prime.isPrime(16);
        assertFalse(result);
    }

    @Test
    void isPrime_whenInputIsThirtyTwo_thenReturnFalse() {
        boolean result = Prime.isPrime(32);
        assertFalse(result);
    }

}