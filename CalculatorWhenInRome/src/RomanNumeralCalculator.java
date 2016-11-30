import java.util.HashMap;

class RomanNumeralCalculator {

    private HashMap<String, Integer> romanNumeralMap = new HashMap<String, Integer>();
    private HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

    RomanNumeralCalculator() {
        populateRomanNumeralHashMap();
        populateIntegerHashMap();
    }

    private void populateRomanNumeralHashMap() {
        romanNumeralMap.put("I", 1);
        romanNumeralMap.put("II", 2);
        romanNumeralMap.put("III", 3);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("X", 10);
    }

    private void populateIntegerHashMap() {
        integerMap.put(1, "I");
        integerMap.put(2, "II");
        integerMap.put(3, "III");
        integerMap.put(5, "V");
        integerMap.put(10, "X");
    }

    String add(String firstRoman, String secondRoman) {
        return convertToRomanNumeral(convertToInteger(firstRoman, secondRoman));
    }

    public String convertToRomanNumeral(Integer integer) {
        if (integerMap.containsKey(integer)) {
            return integerMap.get(integer);
        }
        if(integer == 4){
            return "IV";
        }
        if(integer == 9){
            return "IX";
        }
        String result = "";
        for (int i = integer; i > 0; i--) {

            if (integerMap.containsKey(i)) {
                return integerMap.get(i) + result;
            }
            result += integerMap.get(1);
        }
        return null;
    }

    private Integer convertToInteger(String firstRoman, String secondRoman) {
        final int result = validate(firstRoman) + validate(secondRoman);
        return result;
    }

    public int validate(String romanNumeral) {
        String[] splitRoman = romanNumeral.split("");
        int result = 0;
        for (int i = 1; i < splitRoman.length; i++) {
            if (romanNumeralMap.containsKey(splitRoman[i])) {
                if (i + 1 < splitRoman.length) {
                    if (checkNextRomanIsGreater(splitRoman[i], splitRoman[i + 1])) {
                        result = romanNumeralMap.get(splitRoman[i+1]) - romanNumeralMap.get(splitRoman[i]);
                        i += 2;
                    }
                    else {
                        result += romanNumeralMap.get(splitRoman[i]);
                    }
                }
                else {
                    result += romanNumeralMap.get(splitRoman[i]);
                }

            }
        }
        return result;
    }


    private boolean checkNextRomanIsGreater(String s, String s1) {
        return romanNumeralMap.get(s1) > romanNumeralMap.get(s);
    }
}
