import compare.TestWinner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import simple.TestHitType;
import simple.TestInvalidPokers;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestHitType.class,
        TestInvalidPokers.class,
        TestWinner.class
})
public class TestRunner {

}
