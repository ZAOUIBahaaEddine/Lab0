import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.BlackJack;




public class BlackJackTest {

    private BlackJack blackjack;

    @BeforeEach
    void setUp (){
        blackjack = new BlackJack();
    }

    @Test
    public void testBothPlayersGoTooHigh() {
        int result = blackjack.play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testPlayWithOneValueOver21() {
        
        Assertions.assertEquals(18, blackjack.play(18, 22));
        Assertions.assertEquals(17, blackjack.play(22, 17));
    }

    @Test
    public void testPlayWithEqualValues() {
        // Not sure whether this test is necessary or not, I will check later

        Assertions.assertEquals(20, blackjack.play(20, 20));
        Assertions.assertEquals(15, blackjack.play(15, 15));
        // There is no case where they both surpass 21 and be equal at the same time
    }

    @Test
    public void testPlayWithOneReaches21() {
        
        Assertions.assertEquals(21, blackjack.play(20, 21));
        Assertions.assertEquals(21, blackjack.play(21, 20));
    }

    @Test
    public void testBothPlayersGoUnder21() {
        
        Assertions.assertEquals(16, blackjack.play(16, 15));
        Assertions.assertEquals(17, blackjack.play(17, 16));
    }

    @Test
    public void testOneWinsBecauseTheOtherSurpassed21() {
        
        Assertions.assertEquals(16, blackjack.play(16, 22));
        Assertions.assertEquals(17, blackjack.play(17, 22));
    }


}
