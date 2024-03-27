class Solution {
public:
    int maxArea(vector<int>& heights) {
        int maxArea = 0;  
        int left = 0;
        int right = heights.size() - 1;
        while (left < right) {
            maxArea = max(min(heights[left], heights[right]) * (right - left), maxArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
};