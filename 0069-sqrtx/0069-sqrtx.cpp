class Solution {
public:
    int mySqrt(int x) {
        int n = x/2;
        int left = 2;
        int right = n;

        if (x == 1) return 1;
        while (left <= right) {
            long mid = left + (right - left)/2;
            if ((mid * mid) == x) return mid;
            else if ((mid * mid) > x) right = mid - 1;
            else left = mid + 1;
        }
        return right;
    }
};