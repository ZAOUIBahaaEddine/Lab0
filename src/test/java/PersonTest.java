import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.Person;

public class PersonTest {

    @Test
    public void returnsTheRightFullName() {
        Person p1 = new Person("Bahaa Eddine" , "ZAOUI", 22);
        System.out.println( (p1.getFullName()));
        Assertions.assertEquals("Bahaa Eddine ZAOUI", p1.getFullName()); // Will pass
        Assertions.assertEquals("Abdedaka Weld Elhamri", p1.getFullName()); // will fail
    }
}
