package interviewbit.arrays;

import java.util.ArrayList;

public class RotateArray {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 1; // rotations
        ArrayList<Integer> result = new RotateArray().rotateArray(A, B);
        System.out.println(result);
    }

    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        int n = A.size();
        if (B >= n) {
            B = B % n;
        }
        ArrayList<Integer> ret = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            int pos = i + B >= n ? i + B - n : i + B;
            ret.add(i, A.get(pos));
        }
        return ret;
    }
}


