package interviewbit.arrays;

import java.util.ArrayList;

public class FirstMissingInteger {

    public int firstMissingPositive(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            int pos = A.get(i) - 1;
            while (1 <= A.get(i) && A.get(i) <= A.size() && !A.get(i).equals(A.get(pos))) {
                int tmp = A.get(i);
                A.set(i, A.get(pos));
                A.set(pos, tmp);
                pos = A.get(i) - 1;
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (i + 1 != A.get(i)) {
                return i + 1;
            }
        }
        return A.size() + 1;
    }

}
