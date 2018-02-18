public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 8, 3, 5, 8, 9, 0, 1, 32};
        for (int i : a) {
            System.out.print(i + " ");
        }
        new MergeSort().mergeSort(a, 0, a.length - 1);
        System.out.print("\n");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private void mergeSort(int[] a, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, h);
            merge(a, l, mid, h);
        }
    }

    private void merge(int[] a, int l, int mid, int h) {
        int p1 = mid - l + 1;
        int p2 = h - mid;

        int[] a1 = new int[p1];
        int[] a2 = new int[p2];

        for (int i = 0; i < p1; i++) {
            a1[i] = a[l + i];
        }
        for (int i = 0; i < p2; i++) {
            a2[i] = a[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        // Compare both arrays and pick ordered value.
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

        // Copy remaining items from left array.
        while (i < p1) {
            a[k] = a1[i];
            i++;
            k++;
        }

        // Copy remaining items from right array.
        while (j < p2) {
            a[k] = a2[j];
            j++;
            k++;
        }
    }

}
