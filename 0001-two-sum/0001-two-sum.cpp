class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        vector<int> result(2);
        for (int i = 0; i < nums.size(); ++i) {
            if (map.find(target - nums[i]) == map.end()) {
                map[nums[i]] = i;
            } else {
                result[1] = i;
                result[0] = map[target - nums[i]];
                return result;
            }
        }
        return result;
    }
};