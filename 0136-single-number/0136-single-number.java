class Solution {
    public int singleNumber(int[] nums) {
        int result;
        Map map = new HashMap();

        for (int i = 0; i < nums.length; ++i) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                map.remove(nums[i]);
            }
        }

        return (int) map.keySet().iterator().next();
    }
}