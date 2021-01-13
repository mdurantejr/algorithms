package interviewbit.arrays;

import java.util.Arrays;
import java.util.List;

public class PerfectPeakOfArray {

    public static void main(String[] args) {
        List<Integer> l =
                Arrays.asList(
                        9488, 25784, 5652, 9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529
                );

        System.out.println(new PerfectPeakOfArray().perfectPeak(l));
    }

    public int perfectPeak(List<Integer> A) {
        if (null == A || A.size() < 3) {
            return 0;
        }

        int curr = A.get(0);
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > curr) {
                curr = A.get(i);
                boolean good = true;
                for (int j = A.size() - 1; j > i; j--) {
                    if (A.get(j) <= curr) {
                        good = false;
                        break;
                    }
                }
                if (good) {
                    return 1;
                }
            }
        }
        return 0;
    }

}
