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
    public void II_minus_II_should_be_emptyString(){
        assertEquals("", calculator.subtract("II", "II"));
    }

    @Test
    public void II_minus_I_should_be_I(){
        assertEquals("I", calculator.subtract("II", "I"));
    }

    @Test
    public void I_minus_II_should_be_negative_I(){
        assertEquals("-I", calculator.subtract("I", "II"));
    }

    @Test
    public void MCXV_minus_DLVI_should_be_DLIX(){
        assertEquals("DLIX", calculator.subtract("MCXV", "DLVI"));
    }

    @Test
    public void C_minus_I_should_be_XCIX(){
        assertEquals("XCIX", calculator.subtract("C", "I"));
    }

    @Test
    public void XXV_minus_XXI_should_be_IV(){
        assertEquals("IV", calculator.subtract("XXV", "XXI"));
    }

    @Test
    public void MMM_minus_I_should_be_MMCMXCIX(){
        assertEquals("MMCMXCIX", calculator.subtract("MMM", "I"));
    }
}
