import java.util.HashMap;

public class Helper
{

    public static int convertToInteger(HashMap<String, Integer> romanNumeralMap, String romanNumeral) {
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

    private static boolean checkNextRomanIsGreater(HashMap<String, Integer> romanNumeralMap, String s, String s1) {
        return romanNumeralMap.get(s1) > romanNumeralMap.get(s);
    }

}
