import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

    public static void main(String[] args) {
        String s = "abcdeuqwrp";
        new FirstRepeatingChar().check(s);
    }

    private void check(String s) {
        char[] charr = s.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < charr.length; i++) {
            if (!charSet.add(charr[i])) {
                System.out.print(charr[i]);
                break;
            }
        }
        System.out.print("No repetition.");
    }

}
