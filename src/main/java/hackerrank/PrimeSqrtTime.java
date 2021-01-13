package hackerrank;

public class PrimeSqrtTime {

    public static void main(String[] args) {
        int p = 3;
        int[] a = {12, 5, 7};
        new PrimeSqrtTime().checkPrime(p, a);
    }

    private void checkPrime(int p, int[] a) {
        for(int k = 0; k < p; k++){
            int n = a[k];
            if (n == 1) {
                System.out.println("Not prime");
            } else {
                boolean prime = true;
                int sqrt = (int) Math.sqrt(n);
                for (int i = 2; i <= sqrt; i++) {
                    if (n % i == 0) {
                        System.out.println("Not prime");
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println("Prime");
                }
            }
        }
    }

}
