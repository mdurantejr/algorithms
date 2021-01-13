package interviewbit.arrays;

import java.util.ArrayList;

public class KthRowOfPascalTriangle {

    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else if (j < 1) {
                    ArrayList<Integer> prevrow = tri.get(i - 1);
                    curr.add(prevrow.get(j) + prevrow.get(j - 1));
                }
            }
            tri.add(curr);
            if (i == A) {
                // kth row
                return curr;
            }
        }
        return new ArrayList<>();
    }

}
