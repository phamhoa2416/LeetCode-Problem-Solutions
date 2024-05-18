class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        if (triangle.size() == 0) {
            return 0;
        }

        int size = triangle.size();
        vector<int> dp(size + 1);

        for (int i = size - 1; i >= 0; --i) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle[i][j] + min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
};