package interviewbit.math;

public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println(new PalindromeInteger().check(121));
    }

    public int check(int A) {
        char[] arr = String.valueOf(A).toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return 0;
            }
        }
        return 1;
    }

}
