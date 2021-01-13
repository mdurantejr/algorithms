package interviewbit.arrays;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
//        A = [0, 1, 1]
//        B = [0, 1, 2]
//        out = 2


        int sizea = A.size();
        int sizeb = B.size();

        if (sizea <= 0 || sizea != sizeb) {
            return 0;
        }

        int curra = A.get(0);
        int currb = B.get(0);
        int steps = 0;
        for (int i = 1; i < sizea; i++) {
            int nexta = A.get(i);
            int nextb = B.get(i);
            steps += Math.max(Math.abs(curra - nexta), Math.abs(currb - nextb));
            curra = nexta;
            currb = nextb;
        }
        return steps;
    }

}
