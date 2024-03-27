class Solution {
public:
    double myPow(double x, int n) {
        double result = 1;

        if (n == INT_MIN) {
            // Special case handling for n = INT_MIN
            result = x;
            n++;
        }

        int temp = n > 0 ? n : - n;

        while (temp > 0) {
            if (temp % 2 != 0) {
                result = result * x;
            }
            x = x * x;
            temp = temp / 2;
        } 
        if (n > 0) return result;
        else return 1/result;
    }
};
