package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        if (A.size() == 1) {
            return A;
        }
        ArrayList<Integer> l = new ArrayList<>(A);
        ArrayList<Integer> ret = new ArrayList<>();
        Collections.sort(l);
        for (int i = 0; i < l.size() - 1; i++) {
            if (i % 2 == 0) {
                ret.add(l.get(i + 1));
                ret.add(l.get(i));
            }
            if (i == l.size() - 2 && l.size() % 2 != 0) {
                ret.add(l.get(i + 1));
            }
        }
        return ret;
    }

}
