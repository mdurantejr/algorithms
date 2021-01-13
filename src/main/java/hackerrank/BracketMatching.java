package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketMatching {

    public static void main(String[] args) {
        String s = "(aasaopj[ccsff[]fds]vc)";
        new BracketMatching().match(s);
    }

    // Allowed brackets:
    // (, [, {, }, ], )
    private void match(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charr = s.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            char ch = charr[i];
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ']' && '[' != stack.pop()) {
                throw new IllegalArgumentException("1");
            } else if (ch == ')' && '(' != stack.pop()) {
                throw new IllegalArgumentException("2");
            } else if (ch == '}' && '{' != stack.pop()) {
                throw new IllegalArgumentException("3");
            }
        }
        if (stack.size() != 0) {
            throw new IllegalArgumentException("4");
        }
        System.out.print("correct.");
    }

}
