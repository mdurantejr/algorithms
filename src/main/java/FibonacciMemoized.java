public class FibonacciMemoized {

    public static void main(String[] args) {
        int n = 1000; // n-th position in the fibonacci sequence.
        Long[] memo = new Long[n];
        System.out.println(fibonacci(n, memo));
    }

    private static long fibonacci(long n, Long[] memo) {
        long result;
        if (null != memo[(int) n - 1]) {
            return memo[(int) n - 1];
        }
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        memo[(int) n - 1] = result;
        return result;
    }

}
