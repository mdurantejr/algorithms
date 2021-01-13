package interviewbit.arrays;

import java.util.List;

public class MaxSumContiguousSubarray {

    public int maxSubArray(final List<Integer> A) {
        int size = A.size();
        int maxsofar = Integer.MIN_VALUE;
        int maxtohere = 0;

        for (int i = 0; i < size; i++) {
            maxtohere += A.get(i);
            if (maxsofar < maxtohere) {
                maxsofar = maxtohere;
            }
            if (maxtohere < 0) {
                maxtohere = 0;
            }
        }
        return maxsofar;
    }

}
