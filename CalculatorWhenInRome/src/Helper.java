import java.util.HashMap;

public class Helper
{
    public HashMap<String, Integer> romanNumeralMap = new HashMap<String, Integer>();
    public HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

    Helper(){
        populateRomanNumeralHashMap();
        populateIntegerHashMap();
    }

    private void populateIntegerHashMap() {
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
    }

    public int convertToInteger(String romanNumeral) {
        String[] splitRoman = romanNumeral.split("");
        int result = 0;
        for (int i = 1; i < splitRoman.length; i++) {
            if (romanNumeralMap.containsKey(splitRoman[i])) {
                if (i + 1 < splitRoman.length) {
                    if (checkNextRomanIsGreater(romanNumeralMap, splitRoman[i], splitRoman[i + 1])) {
                        result += romanNumeralMap.get(splitRoman[i + 1]) - romanNumeralMap.get(splitRoman[i]);
                        i += 2;
                    } else {
                        result += romanNumeralMap.get(splitRoman[i]);
                    }
                } else {
                    result += romanNumeralMap.get(splitRoman[i]);
                }
            }
        }
        return result;
    }

    public String convertToRomanNumeral(Integer integer) {
        String romanNumber = "";
        RomanResult result = new RomanResult(0,"");
        final int I = romanNumeralMap.get("I");
        final int IV = romanNumeralMap.get("IV");
        final int V = romanNumeralMap.get("V");
        final int X = romanNumeralMap.get("X");
        final int IX = romanNumeralMap.get("IX");
        final int XL = romanNumeralMap.get("XL");
        final int L = romanNumeralMap.get("L");
        final int XC = romanNumeralMap.get("XC");
        final int C = romanNumeralMap.get("C");

        for (int i = 0; i <= integer; i++) {

            result = IterateThrough(C, integer, romanNumber);
            result = IterateThrough(XC, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(L, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(XL, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(X, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(IX, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(V, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(IV, result.getInputInteger(), result.getRomanNumber());
            result = IterateThrough(I, result.getInputInteger(), result.getRomanNumber());

        }
        return result.getRomanNumber();

    }

    private RomanResult IterateThrough(int c, int inputInteger, String romanNumber) {
        while (inputInteger / c >= 1.0) {
            romanNumber += integerMap.get(c);
            inputInteger -= c;
        }
        return new RomanResult(inputInteger, romanNumber);
    }

    private static boolean checkNextRomanIsGreater(HashMap<String, Integer> romanNumeralMap, String s, String s1) {
        return romanNumeralMap.get(s1) > romanNumeralMap.get(s);
    }

}
