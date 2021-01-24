package interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix1 {

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int t = 0;
        int b = A.size() - 1;
        int l = 0;
        int r = A.get(0).size() - 1;
        int dir = 0; // 0:left, 1:down, 2: right, 3: up

        ArrayList<Integer> ret = new ArrayList<>();

        while (t <= b && l <= r) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    ret.add(A.get(t).get(i));
                }
                dir = 1;
                t++;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    ret.add(A.get(i).get(r));
                }
                dir = 2;
                r--;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    ret.add(A.get(b).get(i));
                }
                dir = 3;
                b--;
            } else if (dir == 3) {
                for (int i = b; i <= t; i++) {
                    ret.add(A.get(i).get(l));
                }
                dir = 0;
                l++;
            }
        }
        return ret;
    }

}
