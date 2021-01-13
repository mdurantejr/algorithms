package interviewbit.math;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(Integer.MIN_VALUE));
    }

    public int reverse(int A) {
        boolean negative = false;
        char[] arr;
        String s = String.valueOf(A);
        if (A < 0) {
            negative = true;
            arr = s.substring(1).toCharArray();
        } else {
            arr = s.toCharArray();
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 -i] = (char) tmp;
        }
        int ret;
        try {
            ret = Integer.parseInt(new String(arr));
        } catch (NumberFormatException e) {
            return 0;
        }
        return negative? ret * -1 : ret;
    }

}
