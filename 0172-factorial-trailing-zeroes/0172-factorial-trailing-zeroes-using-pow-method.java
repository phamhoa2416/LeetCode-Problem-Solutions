class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int result = 0;

        while (Math.pow(5, count) <= n) {
            count++;
        }

        for (int i = 1; i < count; ++i) {
            result += n / (Math.pow(5, i)); 
        }

        return result;
    }
}