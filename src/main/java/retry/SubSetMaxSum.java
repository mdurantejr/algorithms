package retry;

public class SubSetMaxSum {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    private static int maxSubArraySum(int[] a) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxToHere = 0;

        for (int i = 0; i < a.length; i++) {
            maxToHere += a[i];
            if (maxToHere < 0) {
                maxToHere = 0;
            } else if (maxSoFar < maxToHere) {
                maxSoFar = maxToHere;
            }
        }
        return maxSoFar;
    }

}
