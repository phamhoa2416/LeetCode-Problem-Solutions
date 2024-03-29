class Solution {
public:
    bool checkIfPangram(string sentence) {
        vector<int> ans(26, 0);
        for (int i = 0; i < sentence.length(); ++i) {
            ans[sentence[i] - 'a']++;
        }
        
        for (auto val : ans) {
            if (val == 0) return false;
        }
        return true;
    }
};