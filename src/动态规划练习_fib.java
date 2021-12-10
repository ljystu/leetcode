public class 动态规划练习_fib {
    public int fibNoGood(int n) {
//        if (n == 1 || n == 2)
//            return 1;
//        return fib(n - 1) + fib(n - 2);
        int[] memo = new int[n+1];
        return myfib(memo, n);
    }

    public int myfib(int[] memo, int n) {
        if (n == 1 || n == 0)
            return n;
        if (memo[n] != 0)
            return memo[n];
        memo[n] = myfib(memo, n - 1) + myfib(memo, n - 2);
        return memo[n];
    }
    public int fib(int N) {
        if (N == 0) return 0;
        int[] dp = new int[N + 1];
        // base case
        dp[0] = 0; dp[1] = 1;
        // 状态转移
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N];
    }

    public static void main(String[] args) {
        动态规划练习_fib 动态规划练习_fib = new 动态规划练习_fib();
        System.out.println(动态规划练习_fib.fib(10));
    }
}
