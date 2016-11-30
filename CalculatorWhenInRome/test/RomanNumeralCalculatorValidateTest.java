import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorValidateTest {
    private RomanNumeralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumeralCalculator();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void validate_should_be_2_for_II(){
        assertEquals(2, calculator.validate("II"));
    }

    @Test
    public void validate_should_be_4_for_IV(){
        assertEquals(4, calculator.validate("IV"));
    }

    @Test
    public void convertToRomanNumeral_should_convert_4(){
        assertEquals("IV", calculator.convertToRomanNumeral(4));
    }
}
