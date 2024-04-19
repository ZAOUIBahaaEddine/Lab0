package EXO0_RomanNumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO0_RomanNumeral.RomanNumeralRight;

public class RomanNumeralRightTest {

    @Test
    public void convertModifiedNumberSingleNumberTest() {
        RomanNumeralRight roman = new RomanNumeralRight();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }


    @Test
    public void convertModifiedNumberWithManyDigitsTest() {
        RomanNumeralRight roman = new RomanNumeralRight();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
        // Test sure is passed
    }
}
