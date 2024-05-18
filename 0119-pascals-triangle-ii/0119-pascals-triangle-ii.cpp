class Solution {
public:
    vector<int> getRow(int rowIndex) {
        if (rowIndex == 0) {
            vector<int> row;
            row.push_back(1);
            return row;
        }

        vector<int> row;
        vector<int> currentRow = getRow(rowIndex - 1);

        row.push_back(1);
        for (int i = 1; i < rowIndex; ++i) {
            row.push_back(currentRow[i] + currentRow[i - 1]);
        }
        row.push_back(1);

        return row;
    }
};