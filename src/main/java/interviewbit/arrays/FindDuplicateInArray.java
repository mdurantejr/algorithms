package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicateInArray {

    public int repeatedNumber(final List<Integer> A) {
        List<Integer> in = new ArrayList<>(A);
        Collections.sort(in);
        for (int i = 0; i < in.size() - 1; i++) {
            if (in.get(i).equals(in.get(i + 1))) {
                return in.get(i);
            }
        }
        return -1;
    }

}
