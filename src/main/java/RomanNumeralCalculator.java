class RomanNumeralCalculator {

    private Helper helper;

    RomanNumeralCalculator() {
        helper = new Helper();
    }

    String add(String firstOperand, String secondOperand) {
        final int integerResult = helper.convertToInteger(firstOperand) + helper.convertToInteger(secondOperand);
        if(integerResult > 3999) {
            return "";
        }
        return helper.convertToRomanNumeral(integerResult );
    }

    String subtract(String firstOperand, String secondOperand) {
        return helper.convertToRomanNumeral(
                (helper.convertToInteger(firstOperand) - helper.convertToInteger(secondOperand))
        );
    }
}
