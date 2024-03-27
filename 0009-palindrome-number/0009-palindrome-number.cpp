class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0)
            return false;

        string numStr = to_string(x);

        string reverseStr = numStr;
        reverse(reverseStr.begin(), reverseStr.end());

        return reverseStr == numStr;
    }
};