package interviewbit.math;

public class IsPrime {

    public static void main(String[] args) {
        int prime = new IsPrime().isPrime(13);
        System.out.println(1 == prime);
    }

    public int isPrime(int A) {
        if (A == 1) {
            return 0;
        }
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }

}
