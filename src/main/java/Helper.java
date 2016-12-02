import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Helper
{
    private LinkedHashMap<String, Integer> romanNumeralMap;
    private HashMap<Integer, String> integerMap;

    Helper(){
        romanNumeralMap = new LinkedHashMap<>();
        integerMap = new HashMap<>();
        populateRomanNumeralHashMap();
        populateIntegerHashMap();
    }

    private void populateIntegerHashMap() {
        romanNumeralMap.put("M", 1000);
        romanNumeralMap.put("CM", 900);
        romanNumeralMap.put("D", 500);
        romanNumeralMap.put("CD", 400);
        romanNumeralMap.put("C", 100);
        romanNumeralMap.put("XC", 90);
        romanNumeralMap.put("L", 50);
        romanNumeralMap.put("XL", 40);
        romanNumeralMap.put("X", 10);
        romanNumeralMap.put("IX", 9);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("I", 1);
    }

    private void populateRomanNumeralHashMap() {
        integerMap.put(1, "I");
        integerMap.put(4, "IV");
        integerMap.put(5, "V");
        integerMap.put(9, "IX");
        integerMap.put(10, "X");
        integerMap.put(40, "XL");
        integerMap.put(50, "L");
        integerMap.put(90, "XC");
        integerMap.put(100, "C");
        integerMap.put(400, "CD");
        integerMap.put(500, "D");
        integerMap.put(900, "CM");
        integerMap.put(1000, "M");
    }

    int convertToInteger(String romanNumeral) {
        IntegerResult result = new IntegerResult();
        if (romanNumeral == null) return result.IntegerResult;

        String[] splitRoman = romanNumeral.split("");
        for (int index = 1; index < splitRoman.length; index++) {
            if (romanNumeralMap.containsKey(splitRoman[index]))
                index = handleEffectsOfNextRomanInSequence(result, splitRoman, index);

        }
        return convertToNegativeIfInputWasNegative(result.IntegerResult , splitRoman);
    }

    private int handleEffectsOfNextRomanInSequence(IntegerResult result, String[] splitRoman, int index) {
        final int nextIndex = index + 1;
            if (nextIndex < splitRoman.length && checkNextRomanIsGreater(romanNumeralMap, splitRoman[index], splitRoman[nextIndex])) {
                result.IntegerResult += romanNumeralMap.get(splitRoman[nextIndex]) - romanNumeralMap.get(splitRoman[index]);
                index += 1;
            } else {
                result.IntegerResult += romanNumeralMap.get(splitRoman[index]);
            }
        return index;
    }

    private int convertToNegativeIfInputWasNegative(int result, String[] splitRoman) {
        if(splitRoman.length > 2 && splitRoman[1].equals("-")){
            result*=(-1);
        }
        return result;
    }

    String convertToRomanNumeral(Integer integer) {
        String romanNumber = "";
        if(integer < 0){
            romanNumber = "-";
            integer = Math.abs(integer);
        }
        RomanResult result = new RomanResult(integer, romanNumber);

        for (Map.Entry<String, Integer> entry : romanNumeralMap.entrySet()) {
            result = iterateThrough(entry.getValue(), result.getInputInteger(), result.getRomanNumber());
        }
        return result.getRomanNumber();

    }

    private RomanResult iterateThrough(int c, int inputInteger, String romanNumber) {
        while (inputInteger / c >= 1.0) {
            romanNumber += integerMap.get(c);
            inputInteger -= c;
        }
        return new RomanResult(inputInteger, romanNumber);
    }

    private static boolean checkNextRomanIsGreater(HashMap<String, Integer> romanNumeralMap, String firstRoman, String secondRoman) {
        return romanNumeralMap.get(secondRoman) > romanNumeralMap.get(firstRoman);
    }

    private class IntegerResult {
        int IntegerResult = 0;
    }

}
