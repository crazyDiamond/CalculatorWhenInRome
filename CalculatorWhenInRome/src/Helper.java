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
        String result = "";
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
            while (integer / C >= 1.0) {
                result += integerMap.get(C);
                integer -= C;
            }
            while (integer / XC >= 1.0) {
                result += integerMap.get(XC);
                integer -= XC;
            }
            while (integer / L >= 1.0) {
                result += integerMap.get(L);
                integer -= L;
            }
            while (integer / XL >= 1.0) {
                result += integerMap.get(XL);
                integer -= XL;
            }
            while (integer / X >= 1.0) {
                result += integerMap.get(X);
                integer -= X;
            }
            while (integer / IX >= 1.0) {
                result += integerMap.get(IX);
                integer -= IX;
            }
            while (integer / V >= 1.0) {
                result += integerMap.get(V);
                integer -= V;
            }
            while (integer / IV >= 1.0) {
                result += integerMap.get(IV);
                integer -= IV;
            }
            while (integer / I >= 1.0) {
                result += integerMap.get(I);
                integer -= I;
            }
        }
        return result;

    }

    private static boolean checkNextRomanIsGreater(HashMap<String, Integer> romanNumeralMap, String s, String s1) {
        return romanNumeralMap.get(s1) > romanNumeralMap.get(s);
    }

}
