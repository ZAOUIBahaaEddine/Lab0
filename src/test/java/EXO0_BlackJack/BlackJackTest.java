package EXO0_BlackJack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO0_BlackJack.BlackJack;




public class BlackJackTest {

    private BlackJack blackjack;

    @BeforeEach
    void setUp (){
        blackjack = new BlackJack();
    }

    @Test
    public void bothPlayersGoTooHigh() {
        int result = blackjack.play(30, 30);
        Assertions.assertEquals(0, result);
    }


}
