class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        int length = triangle.size();
        int[] dp = new int[length];

        for (int i = 0; i < length; ++i) {
            dp[i] = triangle.get(length - 1).get(i);
        }

        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; ++j) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
}