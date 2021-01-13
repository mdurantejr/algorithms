package interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsRectangle {

    public int solve(int A, int B, int C, int D) {
        if (A == B && B == C && C == D) {
            // square
            return 1;
        }

        List<Integer> sides = new ArrayList<>();
        sides.add(A);
        sides.add(B);
        sides.add(C);
        sides.add(D);
        Collections.sort(sides);

        if (sides.get(0).equals(sides.get(1)) && sides.get(2).equals(sides.get(3))) {
            return 1;
        }

        return 0;
    }

}
