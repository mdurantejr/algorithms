package hackerrank;

public class Factorial {

    public static void main(String[] args) {
        int i = 4;
        System.out.print(new Factorial().fact(i));
    }

    private int fact(int v) {
        if (v > 1) {
            return v * fact(v - 1);
        }
        return v;
    }

}
