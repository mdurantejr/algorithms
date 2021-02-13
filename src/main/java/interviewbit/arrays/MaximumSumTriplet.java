package interviewbit.arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaximumSumTriplet {

    public int solve(ArrayList<Integer> A) {
        if (null == A || A.size() < 3) {
            return 0;
        }

        int sum = 0;

        int[] input = new int[A.size()];
        int[] suffix = new int[A.size() + 1];
        suffix[A.size()] = 0;

        for (int i = 0; i < A.size(); i++) {
            input[i] = A.get(i);
        }

        for (int i = A.size() - 1; i > 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], input[i]);
        }

        TreeSet<Integer> low = new TreeSet<>();
        low.add(input[0]);
        for (int i = 0; i < A.size(); i++) {
            if (suffix[i + 1] > input[i]) {
                Integer lower = low.lower(input[i]);
                if (null != lower) {
                    sum = Math.max(
                            sum,
                            lower + input[i] + suffix[i + 1]
                    );
                }
            }
            low.add(input[i]);
        }
        return sum;
    }

}
