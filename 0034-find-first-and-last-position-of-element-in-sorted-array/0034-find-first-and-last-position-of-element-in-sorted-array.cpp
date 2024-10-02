class Solution {
public:
    int binarySearch(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        if (binarySearch(nums, target) != -1) {
            int find_pos = binarySearch(nums, target);
            int last_pos = find_pos;
            while (last_pos < nums.size() && nums[last_pos] == target) {
                last_pos++;
            }

            int first_pos = find_pos;
            while (first_pos >= 0 && nums[first_pos] == target) {
                first_pos--;
            }
            cout << first_pos << " " << last_pos;
            return {first_pos + 1, last_pos - 1};
        } else {
            return {-1, -1};
        }
    }
};