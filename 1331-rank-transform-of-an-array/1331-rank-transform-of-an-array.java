class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        int[] sortedUniqueArray = Arrays.stream(arr).distinct().sorted().toArray();

        int length = sortedUniqueArray.length;
        for (int i = 0; i < length; ++i) 
            rankMap.put(sortedUniqueArray[i], i + 1);

        for (int i = 0; i < arr.length; ++i) 
            arr[i] = rankMap.get(arr[i]);

        return arr;
    }
}