import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelperTest {
    private Helper helper;

    @org.junit.Before
    public void setUp() throws Exception {
        helper = new Helper();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void convertToInteger_should_be_2_for_II(){
        assertEquals(2, helper.convertToInteger("II"));
    }

    @Test
    public void convertToInteger_should_be_4_for_IV(){
        assertEquals(4, helper.convertToInteger("IV"));
    }

    @Test
    public void convertToInteger_should_be_61_for_LXI(){
        assertEquals(61, helper.convertToInteger("LXI"));
    }

    @Test
    public void convertToInteger_should_be_140_for_CXL(){
        assertEquals(140, helper.convertToInteger("CXL"));
    }

    @Test
    public void convertToInteger_should_be_9_for_IX(){
        assertEquals(9, helper.convertToInteger( "IX"));
    }

    @Test
    public void convertToInteger_should_be_90_for_XC(){
        assertEquals(90, helper.convertToInteger( "XC"));
    }

    @Test
    public void convertToInteger_should_be_1449_for_CM(){
        assertEquals(1447, helper.convertToInteger( "MCDXLVII"));
    }

    @Test
    public void convertToInteger_should_return_negative_15_for_negative_XV(){
        assertEquals(-15, helper.convertToInteger( "-XV"));
    }

    @Test
    public void convertToInteger_will_return_zero_when_given_null(){
        assertEquals(0, helper.convertToInteger( null));
    }

    @Test
    public void convertToInteger_will_return_zero_when_given_an_invalid_roman_numeral(){
        assertEquals(0, helper.convertToInteger( "J"));
    }

    @Test
    public void convertToRomanNumeral_should_convert_negative_1(){
        assertEquals("-I", helper.convertToRomanNumeral(-1));
    }

    @Test
    public void convertToRomanNumeral_should_convert_negative_666(){
        assertEquals("-DCLXVI", helper.convertToRomanNumeral(-666));
    }

    @Test
    public void convertToRomanNumeral_should_convert_1(){
        assertEquals("I", helper.convertToRomanNumeral(1));
    }

    @Test
    public void convertToRomanNumeral_should_convert_2(){
        assertEquals("II", helper.convertToRomanNumeral(2));
    }

    @Test
    public void convertToRomanNumeral_should_convert_4(){
        assertEquals("IV", helper.convertToRomanNumeral(4));
    }

    @Test
    public void convertToRomanNumeral_should_convert_13(){
        assertEquals("XIII", helper.convertToRomanNumeral(13));
    }

    @Test
    public void convertToRomanNumeral_should_convert_61(){
        assertEquals("LXI", helper.convertToRomanNumeral(61));
    }

    @Test
    public void convertToRomanNumeral_should_convert_140(){
        assertEquals("CXL", helper.convertToRomanNumeral(140));
    }

    @Test
    public void convertToRomanNumeral_should_convert_40(){
        assertEquals("XL", helper.convertToRomanNumeral(40));
    }

    @Test
    public void convertToRomanNumeral_should_convert_41(){
        assertEquals("XLI", helper.convertToRomanNumeral(41));
    }

    @Test
    public void convertToRomanNumeral_should_convert_59(){
        assertEquals("LIX", helper.convertToRomanNumeral(59));
    }

    @Test
    public void convertToRomanNumeral_should_convert_90(){
        assertEquals("XC", helper.convertToRomanNumeral(90));
    }

    @Test
    public void convertToRomanNumeral_should_convert_500(){
        assertEquals("D", helper.convertToRomanNumeral(500));
    }

    @Test
    public void convertToRomanNumeral_should_convert_1000(){
        assertEquals("M", helper.convertToRomanNumeral(1000));
    }

    @Test
    public void convertToRomanNumeral_should_convert_900(){
        assertEquals("CM", helper.convertToRomanNumeral(900));
    }

    @Test
    public void convertToRomanNumeral_should_convert_1449(){
        assertEquals("MCDXLIX", helper.convertToRomanNumeral(1449));
    }
    @Test
    public void convertToRomanNumeral_should_convert_3489(){
        assertEquals("MMMCDLXXXIX", helper.convertToRomanNumeral(3489));
    }

}
