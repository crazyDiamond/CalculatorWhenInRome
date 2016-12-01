class RomanNumeralCalculator {

   private Helper helper;

    RomanNumeralCalculator() {
        helper = new Helper();
    }

    String add(String firstOperand, String secondOperand) {
        return helper.convertToRomanNumeral(
                (helper.convertToInteger(firstOperand) + helper.convertToInteger(secondOperand))
        );
    }

    String subtract(String firstOperand, String secondOperand) {
        return helper.convertToRomanNumeral(
                (helper.convertToInteger(firstOperand) - helper.convertToInteger(secondOperand))
        );
    }
}
