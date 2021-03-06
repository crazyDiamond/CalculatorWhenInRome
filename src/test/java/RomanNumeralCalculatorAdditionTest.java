import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorAdditionTest {

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
    public void II_plus_negative_II_should_be_emptyString(){
        assertEquals("", calculator.add("II", "-II"));
    }

    @Test
    public void I_plus_III_should_be_IV(){
        assertEquals("IV", calculator.add("I", "III"));
    }

    @Test
    public void I_plus_IV_should_be_V(){
        assertEquals("V", calculator.add("I", "IV"));
    }

    @Test
    public void I_plus_V_should_be_VI(){
        assertEquals("VI", calculator.add("I", "V"));
    }

    @Test
    public void V_plus_II_should_be_VII(){
        assertEquals("VII", calculator.add("V", "II"));
    }

    @Test
    public void V_plus_V_should_be_X(){
        assertEquals("X", calculator.add("V", "V"));
    }

    @Test
    public void IV_plus_V_should_be_IX(){
        assertEquals("IX", calculator.add("IV", "V"));
    }

    @Test
    public void MCDXLVII_plus_II_should_be_MCDXLIX(){
        assertEquals("MCDXLIX", calculator.add("MCDXLVII", "II"));
    }

    @Test
    public void XI_plus_L_should_be_LXI(){
        assertEquals("LXI", calculator.add("XI", "L"));
    }

    @Test
    public void invalid_roman_numerals_will_add_to_empty_string(){
        assertEquals("", calculator.add("c", ""));
    }

    @Test
    public void invalid_input_in_first_operand_would_return_second_operand(){
        assertEquals("X", calculator.add("c", "X"));
    }

    @Test
    public void invalid_input_in_first_and_second_operand_will_return_empty_string(){
        assertEquals("", calculator.add("c", "b"));
    }

    @Test
    public void a_result_greater_than_3999_will_be_an_empty_string(){
        assertEquals("", calculator.add("MCMXCIX", "MMD"));
    }

}