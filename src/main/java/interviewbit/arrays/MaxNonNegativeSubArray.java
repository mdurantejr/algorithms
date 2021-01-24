package interviewbit.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum = 0L;
        long tempsum = 0L;
        ArrayList<Integer> maxarr = new ArrayList<>();
        ArrayList<Integer> otharr = new ArrayList<>();
        for (int i : A) {
            if (i >= 0) {
                tempsum += i;
                otharr.add(i);
            } else {
                tempsum = 0L;
                otharr.clear();
            }
            if (tempsum > sum || (sum == tempsum && (maxarr.size() < otharr.size()))) {
                sum = tempsum;
                maxarr.clear();
                maxarr.addAll(otharr);
            }
        }
        return maxarr;
    }
}
