class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) return 1;

        int[][] dp = new int[m][n];

        dp[0][0] = 0;
        for (int j = 1; j < n; ++j) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}