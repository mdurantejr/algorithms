import java.util.Arrays;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        int k = 4; // Rotations.
        int[] a = new int[5]; // Expected = {5, 1, 2, 3, 4}
        int[] karr = {1, 2, 3, 4, 5}; // Rotation input array.
        new ArrayLeftRotation().rotate(a, k, karr);
        System.out.println(Arrays.toString(a));
    }

    private void rotate(int[] a, int k, int[] karr) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int pos = (i + (n - k)) % n;
            a[pos] = karr[i];
        }
    }
}
