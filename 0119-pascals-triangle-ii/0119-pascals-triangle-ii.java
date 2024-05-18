class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> dp = new ArrayList<>(rowIndex + 1);
        
        dp.add(0, 1);
        for (int i = 1; i < rowIndex + 1; ++i) { dp.add(i, 0); }
        
        int i = 0;
        while (i < rowIndex) {
            for (int j = 1; j < rowIndex - i + 1; ++j) {
                int temp = dp.get(j - 1) + dp.get(j);
                dp.set(j, temp);
            } 
            i++;
        }

        return dp;
    }
}