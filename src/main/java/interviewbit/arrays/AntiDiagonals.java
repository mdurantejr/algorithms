package interviewbit.arrays;

import java.util.ArrayList;

public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int maxrows = A.size() * 2 - 1;

        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < maxrows; i++) {
            ret.add(new ArrayList<>());
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                ret.get(i + j).add(A.get(i).get(j));
            }
        }

        return ret;
    }

}
