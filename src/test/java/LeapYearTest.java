import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.LeapYear;


public class LeapYearTest {

    private LeapYear leapyear;

    @BeforeEach
    void setUp (){
        leapyear = new LeapYear();
    }

    @Test
    public void leapYearsThatAreNonCenturialYears() {
        boolean result = leapyear.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
    @Test
    public void leapCenturialYears() {
        Assertions.assertTrue(leapyear.isLeapYear(2000));
    }
    @Test
    public void nonLeapCenturialYears() {
        Assertions.assertFalse(leapyear.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        Assertions.assertFalse(leapyear.isLeapYear(2017));
    }
}
