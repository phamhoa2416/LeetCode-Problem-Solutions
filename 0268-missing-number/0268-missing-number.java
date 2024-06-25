class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int expected = ((length + 1) * length) / 2;
        return expected - Arrays.stream(nums).sum();
    }
}