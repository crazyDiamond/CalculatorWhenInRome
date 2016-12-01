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
    public void validate_should_be_61_for_LXI(){
        assertEquals(61, calculator.validate("LXI"));
    }

    @Test
    public void validate_should_be_140_for_CXL(){
        assertEquals(140, calculator.validate("CXL"));
    }

    @Test
    public void convertToRomanNumeral_should_convert_1(){
        assertEquals("I", calculator.convertToRomanNumeral(1));
    }

    @Test
    public void convertToRomanNumeral_should_convert_2(){
        assertEquals("II", calculator.convertToRomanNumeral(2));
    }

    @Test
    public void convertToRomanNumeral_should_convert_4(){
        assertEquals("IV", calculator.convertToRomanNumeral(4));
    }

    @Test
    public void convertToRomanNumeral_should_convert_13(){
        assertEquals("XIII", calculator.convertToRomanNumeral(13));
    }

    @Test
    public void convertToRomanNumeral_should_convert_61(){
        assertEquals("LXI", calculator.convertToRomanNumeral(61));
    }

    @Test
    public void convertToRomanNumeral_should_convert_140(){
        assertEquals("CXL", calculator.convertToRomanNumeral(140));
    }

    @Test
    public void convertToRomanNumeral_should_convert_40(){
        assertEquals("XL", calculator.convertToRomanNumeral(40));
    }

    @Test
    public void convertToRomanNumeral_should_convert_41(){
        assertEquals("XLI", calculator.convertToRomanNumeral(41));
    }
}
