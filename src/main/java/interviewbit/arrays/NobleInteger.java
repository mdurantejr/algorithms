package interviewbit.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList( // -1
            -4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5
        );
//        List<Integer> A = Arrays.asList( // 1
//            -4, -2, 0, -1, -6
//        );
//        List<Integer> A = Arrays.asList( // -1
//                -1, -7, 5, 7, -10, 8, 1, -1, -1, -3, -2, 2, 5, -7, -6, -1, 0, -8, -10, -9, -1, -4, 2, -9, -8, -10, 7, -7, -9, -9, -1, 0, -5, 6, -3, 7, 4, 0, -4, -6, 7, 4, -2, -5, 8, 2, -4, -10, -4, -4, 4, 6, 2, 8, -1, -4, 0, -3, 0, 1, -10, 1, 3, 7, -3, 2, -4, 4, 5, 2, 0, 2, 9, 0, -1, -1, 4, 5, -9, -10, 3, -3, -2, 8, -4, 0
//        );
        System.out.println(new NobleInteger().solve(A));
    }

    public int solve(List<Integer> A) {
        if (null == A || (A.size() == 1 && A.get(0) > 0)) {
            return -1;
        }
        if (A.size() == 1 && A.get(0) == 0) {
            return 1;
        }

        Collections.sort(A);
        if (A.get(A.size() - 1).equals(0)) {
            return 1;
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == A.size() - 1 - i
                    && !A.get(i).equals(A.get(A.size() - 1))
                    && i != A.size() - 1 && !A.get(i).equals(A.get(i + 1))
            ) {
                return 1;
            }
        }
        return -1;
    }

}
