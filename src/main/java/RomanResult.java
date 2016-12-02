public class RomanResult {
    private Integer inputInteger;
    private String romanNumber;

    public RomanResult(int inputInteger, String romanNumber) {
        this.inputInteger = inputInteger;
        this.romanNumber = romanNumber;
    }

    public Integer getInputInteger() {
        return inputInteger;
    }

    public void setInputInteger(Integer inputInteger) {
        this.inputInteger = inputInteger;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }
}
