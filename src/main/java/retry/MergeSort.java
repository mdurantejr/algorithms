package retry;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 3, 8, 4, 5, 7};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        new MergeSort().mergeSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            sort(a, l, mid, r);
        }
    }

    private void sort(int[] a, int l, int mid, int r) {
        int p1 = mid - l + 1;
        int p2 = r - mid;

        int[] a1 = new int[p1];
        for (int i = 0; i < p1; i++) {
            a1[i] = a[l + i];
        }
        int a2[] = new int[p2];
        for (int i = 0 ; i < p2; i++) {
            a2[i] = a[mid + 1 + i];
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
    }

}