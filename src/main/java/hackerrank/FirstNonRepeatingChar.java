package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "aaabbcdddee";
        new FirstNonRepeatingChar().check(s);
    }

    private void check(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        char[] charr = s.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (m.containsKey(charr[i])) {
                int c = m.get(charr[i]);
                m.put(charr[i], c + 1);
            } else {
                m.put(charr[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            if (e.getValue() == 1) {
                System.out.print(e.getKey() + " " + e.getValue());
                break;
            }
        }
    }

}
