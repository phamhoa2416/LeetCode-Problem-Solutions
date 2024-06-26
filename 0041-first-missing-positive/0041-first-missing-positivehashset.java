class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            set.add(nums[i]);
        }

        int max = Arrays.stream(nums).max().getAsInt();
        int result = 1;
        while (result < max) {
            if (!set.contains(result)) {
                break;
            }
            result++;
        }
        if (result == max) return result + 1;
        else return result;
    }
}