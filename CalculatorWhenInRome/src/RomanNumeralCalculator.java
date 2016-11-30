import java.util.HashMap;

class RomanNumeralCalculator {

    private HashMap<String, Integer> romanNumeralMap = new HashMap<String, Integer>();
    private HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

    RomanNumeralCalculator(){
        populateRomanNumeralHashMap();
        populateIntegerHashMap();
    }

    private void populateRomanNumeralHashMap() {
        romanNumeralMap.put("I", 1);
        romanNumeralMap.put("II", 2);
        romanNumeralMap.put("III", 3);
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("V", 5);
    }

    private void populateIntegerHashMap() {
        integerMap.put(1, "I");
        integerMap.put(2, "II");
        integerMap.put(3, "III");
        integerMap.put(4, "IV");
        integerMap.put(5, "V");
    }

    String add(String firstRoman, String secondRoman) {
        return convertToRomanNumaral(convertToInteger(firstRoman, secondRoman));
    }

    private String convertToRomanNumaral(Integer integer) {
        if(integerMap.containsKey(integer)){
            return integerMap.get(integer);
        }
        String result = "";
        for(int i=integer; i>0; i--){
            if(integerMap.containsKey(i)){
                return integerMap.get(i) + result;
            }
            result += integerMap.get(1);
        }
        return null;
    }

    private Integer convertToInteger(String firstRoman, String secondRoman) {
        return romanNumeralMap.get(firstRoman) + romanNumeralMap.get(secondRoman);
    }
}
