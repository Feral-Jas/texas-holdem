package compare;

import model.Hand;
import model.Poker;
import model.Result;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestWinner {
    @Test
    public void findWinner(){
        Result royalThree = new Hand().draw(new Poker(7, 1))
                .draw(new Poker(7, 1))
                .draw(new Poker(7, 1))
                .analyze();
        Result straight = new Hand().draw(new Poker(7, 1))
                .draw(new Poker(6, 1))
                .draw(new Poker(5, 2))
                .analyze();
        Result straightFlush = new Hand().draw(new Poker(8, 3))
                .draw(new Poker(6, 3))
                .draw(new Poker(7, 3))
                .analyze();
        int compare1 = royalThree.compare(straight);
        int compare2 = straight.compare(straightFlush);
        assertEquals(compare1,3);
        assertEquals(compare2,1);
    }
}
