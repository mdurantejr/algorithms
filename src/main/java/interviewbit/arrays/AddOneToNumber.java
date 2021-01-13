package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class AddOneToNumber {

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (null == A || A.size() == 0) {
            ret.add(0);
            return ret;
        }

        for (int i = A.size() - 1; i >= 0; i--) {
            int curr = A.get(i);
            if (curr + 1 > 9) {
                curr = 0;
                A.set(i, curr);
                if (i == 0) {
                    A.add(i, 1);
                    break;
                }
            } else {
                curr += 1;
                A.set(i, curr);
                break;
            }
        }

        int i = 0;
        Iterator<Integer> iterator = A.iterator();
        while (iterator.hasNext() && iterator.next() == 0) {
            ++i;
        }
        A.subList(0, i).clear();

        return A;
    }

}
