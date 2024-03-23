

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.RomanNumeral;

public class RomanNumeralTest {

    
    @Test
    public void testConvert() {
        RomanToDecimal converter = new RomanToDecimal();
        // This is the minimum test that covers some edge points
        // I aggregated the previous methods into this one

        Assertions.assertEquals(1, converter.convert("I"));
        Assertions.assertEquals(4, converter.convert("IV"));
        Assertions.assertEquals(9, converter.convert("IX"));
        Assertions.assertEquals(58, converter.convert("LVIII"));
        Assertions.assertEquals(1994, converter.convert("MCMXCIV"));
    }

    @Test
    public void testEmptyString() {
        RomanToDecimal converter = new RomanToDecimal();
        Assertions.assertEquals(0, converter.convert(""));
        // Not sure whether it should return 0 or NULL
    }

    @Test
    public void testInvalidInput() {
        RomanToDecimal converter = new RomanToDecimal();
        Assertions.assertThrows(IllegalArgumentException.class, () -> converter.convert("INVALID"));
    }
}
