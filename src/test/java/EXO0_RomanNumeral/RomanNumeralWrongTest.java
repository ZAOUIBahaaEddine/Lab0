package EXO0_RomanNumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO0_RomanNumeral.RomanNumeralWrong;

public class RomanNumeralWrongTest {

    @Test
    public void convertSingleNumberTest() {
        RomanNumeralWrong roman = new RomanNumeralWrong();
        int result = roman.convert("I");


        Assertions.assertEquals(1, result);
        // Assertions.assertEquals(3, result);
        // The second test will be executed, fail and the next test will
        // not be executed!
        // Assertions.assertEquals(2, result);
        
    }


    @Test
    public void convertNumberWithManyDigitsTest() {
        RomanNumeralWrong roman = new RomanNumeralWrong();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
        // This also is expected to return an error
    }

}
