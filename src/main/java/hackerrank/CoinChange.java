package hackerrank;

public class CoinChange {

    public static void main(String[] args) {
        int cc = 10;
        int mc = 4;
        int coins[] = new int[]{2, 5, 3, 6};
        System.out.print(countChange(coins, cc));
    }

    private static long countChange(int[] coins, int cc) {
        long[] l = new long[cc + 1];
        l[0] = 1L;

        for (int coin : coins) {
            for (int i = coin; i < l.length; i++) {
                l[i] += l[i - coin];
            }
        }
        return l[cc];
    }

}
