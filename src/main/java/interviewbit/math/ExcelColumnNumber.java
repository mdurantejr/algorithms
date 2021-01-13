package interviewbit.math;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();

        int idx = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == A.charAt(0)) {
                idx = i + 2;
                break;
            }
        }
        if (A.length() == 1) {
            return idx - 1;
        }

        return idx * 26 + idx;
    }

}
