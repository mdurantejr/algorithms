package hackerrank;

public class MergeSortCountInversions {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 1, 2};
        long result = countInversions(a);
        System.out.println(result);
    }

    private static long countInversions(int[] arr) {
        return merge(arr, 0, arr.length - 1);
    }

    private static long merge(int[] a, int l, int r) {
        if (l >= r) {
            return 0L;
        }
        long c = 0L;
        int mid = (l + r) / 2;
        c += merge(a, l, mid);
        c += merge(a, mid + 1, r);
        c += sort(a, l, mid, r);
        return c;
    }

    private static long sort(int[] a, int l, int mid, int r) {
        long inv = 0;
        int p1 = mid - l + 1;
        int p2 = r - mid;
        int[] a1 = new int[p1];
        for (int i = 0; i < p1; i++) {
            a1[i] = a[i + l];
        }
        int[] a2 = new int[p2];
        for (int i = 0; i < p2; i++) {
            a2[i] = a[i + mid + 1];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < p1 && j < p2) {
            if (a1[i] <= a2[j]) {
                a[k] = a1[i];
                i++;
            } else {
                a[k] = a2[j];
                j++;
                inv += a1.length - i;
            }
            k++;
        }

        while (i < p1) {
            a[k] = a1[i];
            i++;
            k++;
        }
        while (j < p2) {
            a[k] = a2[j];
            j++;
            k++;
        }
        return inv;
    }

}
