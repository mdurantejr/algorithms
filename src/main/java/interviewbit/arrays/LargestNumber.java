package interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {

    public String largestNumber(final List<Integer> A) {
        boolean allzero = true;
        for (int i : A) {
            if (i != 0) {
                allzero = false;
                break;
            }
        }
        if (allzero) {
            return "0";
        }
        List<Integer> l = new ArrayList<>(A);
        l.sort((t1, t2) -> {
            final String c1 = String.valueOf(t1);
            final String c2 = String.valueOf(t2);
            return Long.valueOf(c2 + c1).compareTo(Long.valueOf(c1 + c2));
        });
        StringBuilder sb = new StringBuilder();
        l.forEach(sb::append);
        return sb.toString();
    }

}
