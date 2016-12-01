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
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("IX", 9);
        romanNumeralMap.put("X", 10);
        romanNumeralMap.put("L", 50);
    }

    private void populateIntegerHashMap() {
        integerMap.put(1, "I");
        integerMap.put(4, "IV");
        integerMap.put(5, "V");
        integerMap.put(9, "IX");
        integerMap.put(10, "X");
        integerMap.put(50, "L");
    }

    String add(String firstRoman, String secondRoman) {
        return convertToRomanNumeral(convertToInteger(firstRoman, secondRoman));
    }

    public String convertToRomanNumeral(Integer integer) {
        String result = "";
        if (integerMap.containsKey(integer)) {
            return integerMap.get(integer);
        }

        for (int i=0; i<=integer; i++){
            while(integer/50.0 >= 1.0){
                result += "L";
                integer -= 50;
            }
            while(integer/10.0 >= 1.0){
                result += "X";
                integer -= 10;
            }

            while(integer/5.0 >= 1.0){
                result += "V";
                integer -= 5;
            }

            while(integer/1.0 >= 1.0){
                result += "I";
                integer -= 1;
            }
        }
        return result;

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
                        result = romanNumeralMap.get(splitRoman[i + 1]) - romanNumeralMap.get(splitRoman[i]);
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


    private boolean checkNextRomanIsGreater(String s, String s1) {
        return romanNumeralMap.get(s1) > romanNumeralMap.get(s);
    }
}
