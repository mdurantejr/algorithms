package interviewbit.arrays;

import java.util.ArrayList;

public class SpiralOrderMatrix2 {

    public static void main(String[] args) {
        final ArrayList<ArrayList<Integer>> matrix = new SpiralOrderMatrix2().generateMatrix(80);
        System.out.println(matrix);
    }

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> tmp = new ArrayList<>(A);
            for (int j = 0; j < A; j++) {
                tmp.add(-1);
            }
            matrix.add(tmp);
        }
        int u = 0;
        int l = 0;
        int r = A - 1;
        int d = A - 1;
        int c = 1;
        int dir = 0;
        while (u <= d && l <= r) {
            if (dir == 0) {
                ArrayList<Integer> a = matrix.get(u);
                for (int i = l; i <= r; i++) {
                    a.set(i, c);
                    c++;
                }
                dir = 1;
                u++;
            } else if (dir == 1) {
                for (int i = u; i <= d; i++) {
                    ArrayList<Integer> a = matrix.get(i);
                    a.set(r, c);
                    c++;
                }
                dir = 2;
                r--;
            } else if (dir == 2) {
                ArrayList<Integer> a = matrix.get(d);
                for (int i = r; i >= l; i--) {
                    a.set(i, c);
                    c++;
                }
                dir = 3;
                d--;
            } else if (dir == 3) {
                for (int i = d; i >= u; i--) {
                    ArrayList<Integer> a = matrix.get(i);
                    a.set(l, c);
                    c++;
                }
                dir = 0;
                l++;
            }
        }
        return matrix;
    }

}
