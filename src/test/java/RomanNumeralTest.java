

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.RomanNumeral;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");


        Assertions.assertEquals(1, result);
        Assertions.assertEquals(3, result);
        // The second test will be executed, fail and the next test will
        // not be executed!
        Assertions.assertEquals(2, result);
        
    }

}
