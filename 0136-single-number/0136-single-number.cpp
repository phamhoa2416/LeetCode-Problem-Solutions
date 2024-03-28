class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for (auto const& value : nums) {
            ans = ans ^ value;
        }
        return ans;
    }
};