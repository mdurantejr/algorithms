package interviewbit.math;

import java.util.Arrays;

public class NextSimilarNumber {

    public static void main(String[] args) {
        System.out.println(new NextSimilarNumber().solve("892795")); // 892957
    }

    public String solve(String A) {
        // 218765
        // 251678

        if (null == A || A.length() == 1) {
            return "-1";
        }

        char[] charr = A.toCharArray();
        boolean max = true;
        // already max value
        for (int i = 0; i < charr.length - 1; i++) {
            if (charr[i] < charr[i + 1]) {
                max = false;
                break;
            }
        }
        if (max) {
            return "-1";
        }

        boolean asc = true;
        // asc order, swap last 2
        for (int i = 0; i < charr.length - 1; i++) {
            if (charr[i] > charr[i + 1]) {
                asc = false;
                break;
            }
        }
        if (asc) {
            char last = charr[charr.length - 1];
            charr[charr.length - 1] = charr[charr.length - 2];
            charr[charr.length - 2] = last;
            return new String(charr);
        }

        int smallidx = 0;
        int smallv = charr.length - 1;
        for (int i = charr.length - 2; i > 0; i--) {
            if (charr[i] < charr[i + 1]) {
                smallidx = i;
                smallv = charr[i];
                break;
            }
        }

        int smalldiff = Integer.MAX_VALUE;
        int nextsmallidx = 0;
        for (int i = charr.length - 1; i > smallidx; i--) {
            if (charr[i] > smallv && charr[i] - smallv < smalldiff) {
                smalldiff = charr[i] - smallv;
                nextsmallidx = i;
            }
        }

        char tmp = charr[smallidx];
        charr[smallidx] = charr[nextsmallidx];
        charr[nextsmallidx] = tmp;
        Arrays.sort(charr, smallidx + 1, charr.length);
        return new String(charr);
    }

}
