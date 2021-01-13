package hackerrank;

public class FibonacciBottomUp {

    public static void main(String[] args) {
        int n = 1000; // n-th position in the fibonacci sequence.
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1L;
        }
        long[] bottomup = new long[n];
        bottomup[0] = 1L;
        bottomup[1] = 1L;
        for (int i = 2; i < n; i++) {
            bottomup[i] = bottomup[i - 1] + bottomup[i - 2];
        }
        return bottomup[n - 1];
    }

}
