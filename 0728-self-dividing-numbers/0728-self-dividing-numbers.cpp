class Solution {
public:
    bool selfDividingCheck(int n) {
        int num_alt = n;
        while (num_alt > 0) {
            int temp = num_alt % 10;
            if  (temp == 0 || n % temp != 0) return false;
            num_alt = num_alt/10; 
        }
        return true;
    }
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> list;

        for (; left <= right; ++left) {
            if (selfDividingCheck(left) == true) {
                list.push_back(left);
            }
        }
        return list;
    }
};