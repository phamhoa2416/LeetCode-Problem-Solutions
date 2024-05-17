class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] rows = new String[numRows];
        for (int j = 0; j < numRows; ++j) {
            rows[j] = "";
        }

        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); ++j) {
                rows[j] += s.charAt(i++);
            }

            for (int k = numRows - 2; k > 0 && i < s.length(); --k) {
                rows[k] += s.charAt(i++);
            }
        }

        String res = "";
        for (String row : rows) {
            res += row;
        }
        return res;        
    }
}