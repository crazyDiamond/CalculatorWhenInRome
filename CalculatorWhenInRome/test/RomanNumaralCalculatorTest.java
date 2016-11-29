
import org.junit.Test;

public class RomanNumaralCalculatorTest {

    RomanNumaralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumaralCalculator();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void I_plus_I_should_be_II(){
        assert calculator.add("I", "I").equals("II");
    }


}