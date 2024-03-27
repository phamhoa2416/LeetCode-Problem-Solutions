class Solution {
public:
    int reverse(int x) {
        long long reversed{};

        for (; x != 0;) {
            if (reversed * 10 > INT_MAX || reversed * 10 < INT_MIN) return 0;
            reversed = reversed * 10;
            int temp = x % 10;
            x /= 10;
            reversed += temp;
        }

        return reversed;
    }
};