import java.util.HashMap;

class RomanNumeralCalculator {

    public HashMap<String, Integer> romanNumeralMap = new HashMap<String, Integer>();
    public HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

    RomanNumeralCalculator() {
        populateRomanNumeralHashMap();
        populateIntegerHashMap();
    }

    private void populateRomanNumeralHashMap() {
        romanNumeralMap.put("I", 1);
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("IX", 9);
        romanNumeralMap.put("X", 10);
        romanNumeralMap.put("XL", 40);
        romanNumeralMap.put("L", 50);
        romanNumeralMap.put("XC", 90);
        romanNumeralMap.put("C", 100);
    }

    private void populateIntegerHashMap() {
        integerMap.put(1, "I");
        integerMap.put(4, "IV");
        integerMap.put(5, "V");
        integerMap.put(9, "IX");
        integerMap.put(10, "X");
        integerMap.put(40, "XL");
        integerMap.put(50, "L");
        integerMap.put(90, "XC");
        integerMap.put(100, "C");
    }

    String add(String firstRoman, String secondRoman) {
        return Helper.convertToRomanNumeral(integerMap,
                romanNumeralMap,
                (Helper.convertToInteger(romanNumeralMap, firstRoman) + Helper.convertToInteger(romanNumeralMap, secondRoman))
        );
    }
}
