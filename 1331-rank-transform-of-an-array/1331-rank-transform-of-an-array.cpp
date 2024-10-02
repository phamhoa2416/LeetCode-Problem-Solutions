class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        int length = arr.size();
        vector<int> tempArray(arr);
        sort(tempArray.begin(), tempArray.end());

        map<int, int> rankMap;
        int rank = 1;
        for (int num : tempArray) {
            if (rankMap.find(num) == rankMap.end()) {
                rankMap[num] = rank++;
            }
        }

        vector<int> res(length);
        for (int i = 0; i < length; ++i) {
            res[i] = rankMap[arr[i]];
        }

        return res;
    }
};