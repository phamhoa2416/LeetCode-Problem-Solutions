class Solution {
public:
    int nthUglyNumber(int n) {
        vector<int> uglyNumber(n);
        uglyNumber[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        int next_multiply_by_2 = 2;
        int next_multiply_by_3 = 3;
        int next_multiply_by_5 = 5;

        for (int i = 1; i < n; ++i) {
            int nextUglyNumber = min(next_multiply_by_2, min(next_multiply_by_3, next_multiply_by_5));
            uglyNumber[i] = nextUglyNumber;

            if (nextUglyNumber == next_multiply_by_2) {
                i2++;
                next_multiply_by_2 = uglyNumber[i2] * 2;
            }

            if (nextUglyNumber == next_multiply_by_3) {
                i3++;
                next_multiply_by_3 = uglyNumber[i3] * 3;
            }            

            if (nextUglyNumber == next_multiply_by_5) {
                i5++;
                next_multiply_by_5 = uglyNumber[i5] * 5;
            }
        }

        return uglyNumber[n - 1];
    }
};