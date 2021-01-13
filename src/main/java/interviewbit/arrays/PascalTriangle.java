package interviewbit.arrays;

import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> solve(int A) {
        final ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else if (j < i) {
                    ArrayList<Integer> prevrow = ret.get(i - 1);
                    row.add(prevrow.get(j) + prevrow.get(j - 1));
                }
            }
            ret.add(row);
        }
        return ret;
    }

}
