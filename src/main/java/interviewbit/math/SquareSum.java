package interviewbit.math;

import java.util.ArrayList;

public class SquareSum {

    public ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int a = 1; a * a < A; a++) {
            int b = (int) Math.sqrt(A - a * a);
            if (a > b) break;
            if (a * a + b * b != A) continue;
            ArrayList<Integer> newEntry = new ArrayList<>();
            newEntry.add(a);
            newEntry.add(b);
            ans.add(newEntry);
        }
        return ans;
    }

}
