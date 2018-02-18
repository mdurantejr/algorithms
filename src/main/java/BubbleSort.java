public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[]{4,2,8,3,5,8,9,0,1,32};
        for (int i : a) {
            System.out.print(i + " ");
        }
        new BubbleSort().bubbleSort(a);
        System.out.print("\n");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

}
