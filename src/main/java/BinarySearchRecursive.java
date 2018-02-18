public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(search(a, 14, 0, a.length - 1));
    }

    private static int search(int[] a, int n, int l, int h) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;
        if (a[mid] > n) {
            return search(a, n, l, mid - 1);
        } else if (a[mid] < n) {
            return search(a, n, mid + 1, h);
        } else {
            return mid;
        }
    }

}
