package simple;

import model.Hand;
import model.Poker;
import model.Result;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestHitType {
    @Test
    public void isOffSuit(){
        Result handWithResult = new Hand().draw(new Poker(1, 3))
                .draw(new Poker(2, 1))
                .draw(new Poker(4, 1))
                .analyze();
        assertEquals(handWithResult,Result.OFF_SUIT);
    }
    @Test
    public void isPair(){
        assertEquals(Result.PAIR,
                new Hand().draw(new Poker(1, 3))
                .draw(new Poker(2, 1))
                .draw(new Poker(2, 1))
                .analyze()
        );
    }
    @Test
    public void isRoyalThree(){
        Result result = new Hand().draw(new Poker(7, 1))
                .draw(new Poker(7, 1))
                .draw(new Poker(7, 1))
                .analyze();
        assertEquals(Result.ROYAL_THREE,result);
        assertNotEquals(Result.THREE_OF_A_KIND,result);
    }
}
