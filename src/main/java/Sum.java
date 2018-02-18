public class Sum {

    public static void main(String[] args) {
        int v = 4;
        System.out.print(new Sum().sum(v));
    }

    private int sum(int v) {
        if (v > 0) {
            return v + sum(v - 1);
        }
        return v;
    }

}
