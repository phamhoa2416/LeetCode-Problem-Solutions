class Solution {
public:
    bool isPalindrome(string s) {
        string original = "";
        for (int i = 0; i < s.length(); ++i) {
            if (isalnum(s[i])) {
                original += tolower(s[i]);
            }
        }
        string reversed = original;
        reverse(reversed.begin(), reversed.end());

        return original == reversed;
    }
};