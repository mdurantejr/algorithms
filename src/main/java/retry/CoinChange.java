package retry;

public class CoinChange {

    public static void main(String[] args) {
        int cc = 10;
        int mc = 4;
        int coins[] = new int[]{2, 5, 3, 6};
        System.out.print(change(coins, cc));
    }

    private static long change(int[] coins, int money) {
        long[] c = new long[money + 1];
        c[0] = 1L;
        for (int coin : coins) {
            for (int j = coin; j < c.length; j++) {
                c[j] += c[j - coin];
            }
        }
        return c[money];
    }

}
