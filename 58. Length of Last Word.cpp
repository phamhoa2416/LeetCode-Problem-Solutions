class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        int end = s.length() - 1;

        while (end >= 0 && s[end] == ' ') {
            --end; 
        }

        while (end >= 0 && s[end] != ' ') {
            count++; 
            --end; 
        }

        return count;
    }
};
