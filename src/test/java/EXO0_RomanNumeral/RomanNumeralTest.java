package EXO0_RomanNumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO0_RomanNumeral.RomanNumeral;

public class RomanNumeralTest {

    @Test
    public void convertSingleNumberTest() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");


        Assertions.assertEquals(1, result);
        Assertions.assertEquals(3, result);
        // The second test will be executed, fail and the next test will
        // not be executed!
        Assertions.assertEquals(2, result);
        
    }

    @Test
    public void convertNumberWithManyDigitsTest() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
        // This also is expected to return an error
    }


    @Test
    public void convertModifiedNumberSingleNumberTest() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convertModified("I");
        Assertions.assertEquals(1, result);
    }


    @Test
    public void convertModifiedNumberWithManyDigitsTest() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convertModified("VIII");
        Assertions.assertEquals(8, result);
        // Test sure is passed
    }






}
