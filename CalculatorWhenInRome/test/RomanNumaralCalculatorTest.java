import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumaralCalculatorTest {

    private RomanNumaralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumaralCalculator();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void I_plus_I_should_be_II(){
        assertEquals("II", calculator.add("I", "I"));
    }

    @Test
    public void I_plus_II_should_be_III(){
        assertEquals("III", calculator.add("I", "II"));
    }

    @Test
    public void II_plus_I_should_be_III(){
        assertEquals("III", calculator.add("II", "I"));
    }


}