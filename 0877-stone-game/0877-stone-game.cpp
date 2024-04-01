class Solution {
public:
    bool stoneGame(vector<int>& piles) {
        int num = piles.size();
        vector<vector<int>> dp(num, vector<int>(num, 0));
        for (int i = 0; i < num; ++i) {
            dp[i][i] = piles[i];
        }

        for (int d = 1; d < num; ++d) {
            for (int i = 0; i < num - d; ++i) {
                dp[i][i + d] = max(piles[i] - dp[i + 1][i + d], piles[i + d] - dp[i][i + d - 1]);
            }
        }

        return dp[0][num - 1] > 0;
    }
};