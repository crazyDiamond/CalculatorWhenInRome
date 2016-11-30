import java.util.HashMap;

class RomanNumaralCalculator {

    private HashMap<String, Integer> romanNumaralMap = new HashMap<String, Integer>();
    private HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

    RomanNumaralCalculator(){
        romanNumaralMap.put("I", 1);
        romanNumaralMap.put("II", 2);
        romanNumaralMap.put("III", 3);

        integerMap.put(1, "I");
        integerMap.put(2, "II");
        integerMap.put(3, "III");
    }

    String add(String firstRoman, String secondRoman) {
        return integerMap.get(convertToInteger(firstRoman, secondRoman));
    }

    private Integer convertToInteger(String firstRoman, String secondRoman) {
        return romanNumaralMap.get(firstRoman) + romanNumaralMap.get(secondRoman);
    }
}
