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
        assertEquals("I", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 1));
    }

    @Test
    public void convertToRomanNumeral_should_convert_2(){
        assertEquals("II", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 2));
    }

    @Test
    public void convertToRomanNumeral_should_convert_4(){
        assertEquals("IV", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 4));
    }

    @Test
    public void convertToRomanNumeral_should_convert_13(){
        assertEquals("XIII", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 13));
    }

    @Test
    public void convertToRomanNumeral_should_convert_61(){
        assertEquals("LXI", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 61));
    }

    @Test
    public void convertToRomanNumeral_should_convert_140(){
        assertEquals("CXL", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 140));
    }

    @Test
    public void convertToRomanNumeral_should_convert_40(){
        assertEquals("XL", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 40));
    }

    @Test
    public void convertToRomanNumeral_should_convert_41(){
        assertEquals("XLI", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 41));
    }

    @Test
    public void convertToRomanNumeral_should_convert_59(){
        assertEquals("LIX", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 59));
    }

    @Test
    public void convertToRomanNumeral_should_convert_90(){
        assertEquals("XC", Helper.convertToRomanNumeral(calculator.integerMap, calculator.romanNumeralMap, 90));
    }

    @Test
    public void convertToInteger_should_be_90_for_XC(){
        assertEquals(90, Helper.convertToInteger(calculator.romanNumeralMap, "XC"));
    }

}
