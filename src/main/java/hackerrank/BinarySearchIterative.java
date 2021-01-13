package hackerrank;

import java.util.Arrays;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(search(a, 14, 0, a.length - 1));
    }

    private static int search(int[] a, int n, int l, int h) {
        int idx = Integer.MAX_VALUE;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] > n) {
                h = mid - 1;
            } else if (a[mid] < n) {
                l = mid + 1;
            } else if (a[mid] == n) {
                idx = mid;
                break;
            }
        }
        return idx;
    }

}
