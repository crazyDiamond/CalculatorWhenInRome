import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorTest {

    private RomanNumeralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumeralCalculator();

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
    public void II_plus_I_should_be_III_though_params_are_switched(){
        assertEquals("III", calculator.add("II", "I"));
    }

    @Test
    public void I_plus_III_should_be_IV(){
        assertEquals("IV", calculator.add("I", "III"));
    }

    @Test
    public void I_plus_IV_should_be_V(){
        assertEquals("V", calculator.add("I", "IV"));
    }


}