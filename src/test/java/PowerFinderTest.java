import junit.framework.TestCase;
//import org.junit.Test;
import powerpackage.PowerFinder;

public class PowerFinderTest extends TestCase {

    public void testOne_raised_to_one_is_one() {
        assert PowerFinder.OF(1,1) == 1;
    }

    public void testTwoRaised_to_one_is_2() {
        assert PowerFinder.OF(2,1) == 2;
    }

    public void testTwo_power_2_is_4() {
        assert PowerFinder.OF(2, 2) == 4;
    }

    public void testPower_of_2_and_3_Is_SIX() {
        assert PowerFinder.OF(3, 2) == 3*3;
    }

}
