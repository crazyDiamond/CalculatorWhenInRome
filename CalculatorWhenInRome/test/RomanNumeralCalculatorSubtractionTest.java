import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorSubtractionTest {

    private RomanNumeralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumeralCalculator();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void II_minus_I_should_be_I(){
        assertEquals("I", calculator.subtract("II", "I"));
    }


}
