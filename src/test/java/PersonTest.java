import jdk.jfr.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.Person;

public class PersonTest {
    private Person p1;
    @BeforeEach
    void setUp ()
    {
        p1 = new Person("Bahaa Eddine" , "ZAOUI", 22);
    }


    @Test
    public void returnsTheRightFullName() {

        // System.out.println( (p1.getFullName()));
        Assertions.assertEquals("Bahaa Eddine ZAOUI", p1.getFullName()); // Will pass
        Assertions.assertEquals("Abdedaka Weld Elhamri", p1.getFullName()); // will fail
    }
    @Test
    public void returnsTheRightAgeCategory ()
    {
        Assertions.assertEquals(true, p1.isAdult()); // Will pass
    }


}
