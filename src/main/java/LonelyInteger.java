public class LonelyInteger {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        System.out.println(new LonelyInteger().find(a));
    }

    private int find(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num ^= a[i];
        }
        return num;
    }

}
