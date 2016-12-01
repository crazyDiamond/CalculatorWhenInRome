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
        return convertToRomanNumeral(Helper.convertToInteger(romanNumeralMap, firstRoman)
                + Helper.convertToInteger(romanNumeralMap, secondRoman));
    }

    public String convertToRomanNumeral(Integer integer) {
        String result = "";
        final int I = romanNumeralMap.get("I");
        final int IV = romanNumeralMap.get("IV");
        final int V = 5;
        final int X = 10;
        final int IX = romanNumeralMap.get("IX");
        final int XL = 40;
        final int L = 50;
        final int XC = 90;
        final int C = 100;

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

}
