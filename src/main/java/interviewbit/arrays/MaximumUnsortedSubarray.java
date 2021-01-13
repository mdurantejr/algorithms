package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumUnsortedSubarray {

    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (null == A || A.size() == 1) {
            ret.add(-1);
            return ret;
        }
        ArrayList<Integer> cp = new ArrayList<>(A);
        Collections.sort(cp);
        if (cp.equals(A)) {
            ret.add(-1);
            return ret;
        }

        int si = -1;
        int ei = -1;
        for (int i = 0; i < A.size(); i++) {
            if (!A.get(i).equals(cp.get(i))) {
                if (si == -1) {
                    si = i;
                }
                ei = i;
            }
        }
        ret.add(si);
        ret.add(ei);
        return ret;
    }

}
