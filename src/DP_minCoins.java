import java.util.Arrays;

public class DP_minCoins {
    // coins 中是可选硬币面值，amount 是目标金额
    int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 0; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i >= coin)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        DP_minCoins dp_minCoins = new DP_minCoins();
        System.out.println(dp_minCoins.coinChange(new int[]{1, 2, 5}, 12));
    }

}
