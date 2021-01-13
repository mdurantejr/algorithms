package hackerrank;

public class Staircase {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(calculate(n));
    }

    private static int calculate(int n) {
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 2;
        }
        if (3 == n) {
            return 4;
        }

        int[] s = new int[n];
        s[0] = 1;
        s[1] = 2;
        s[2] = 4;

        for (int i = 3; i < n; i++) {
            s[i] = s[i - 1] + s[i - 2] + s[i - 3];
        }

        return s[n - 1];
    }

}
