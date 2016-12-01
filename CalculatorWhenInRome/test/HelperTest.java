import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelperTest {
    private RomanNumeralCalculator calculator;

    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new RomanNumeralCalculator();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void convertToInteger_should_be_2_for_II(){
        assertEquals(2, Helper.convertToInteger(calculator.romanNumeralMap, "II"));
    }

    @Test
    public void convertToInteger_should_be_4_for_IV(){
        assertEquals(4, Helper.convertToInteger(calculator.romanNumeralMap, "IV"));
    }

    @Test
    public void convertToInteger_should_be_61_for_LXI(){
        assertEquals(61, Helper.convertToInteger(calculator.romanNumeralMap, "LXI"));
    }

    @Test
    public void convertToInteger_should_be_140_for_CXL(){
        assertEquals(140, Helper.convertToInteger(calculator.romanNumeralMap, "CXL"));
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

    @Test
    public void convertToRomanNumeral_should_convert_59(){
        assertEquals("LIX", calculator.convertToRomanNumeral(59));
    }

    @Test
    public void convertToRomanNumeral_should_convert_90(){
        assertEquals("XC", calculator.convertToRomanNumeral(90));
    }

    @Test
    public void convertToInteger_should_be_90_for_XC(){
        assertEquals(90, Helper.convertToInteger(calculator.romanNumeralMap, "XC"));
    }

}
