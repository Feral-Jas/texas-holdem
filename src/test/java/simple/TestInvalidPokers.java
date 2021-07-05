package simple;

import exception.InvalidPokerException;
import model.Hand;
import model.Poker;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TestInvalidPokers {
    @Test
    public void invalidPoker(){
        assertThrows(InvalidPokerException.class,()->{
            new Hand().draw(new Poker(1, 3))
                    .draw(new Poker(2, 0))
                    .draw(new Poker(4, 1))
                    .analyze();
        });
        assertThrows(InvalidPokerException.class,()->{
            new Hand().draw(new Poker(1, 3))
                    .draw(new Poker(9, 8))
                    .draw(new Poker(3, 1))
                    .analyze();
        });
        assertThrows(InvalidPokerException.class,()->{
            new Hand().draw(new Poker(-1, 3))
                    .draw(new Poker(22, 1))
                    .draw(new Poker(4, 1))
                    .analyze();
        });
        assertThrows(InvalidPokerException.class,()->{
            new Hand().draw(new Poker(0, 3))
                    .draw(new Poker(15, 1))
                    .draw(new Poker(4, 1))
                    .analyze();
        });
    }
}
