class RomanNumeralCalculator {

   private Helper helper;

    RomanNumeralCalculator() {
        helper = new Helper();
    }

    String add(String firstRoman, String secondRoman) {
        return helper.convertToRomanNumeral(
                (helper.convertToInteger(firstRoman) + helper.convertToInteger(secondRoman))
        );
    }
}
