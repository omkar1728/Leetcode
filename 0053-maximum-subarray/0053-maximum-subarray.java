class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            prev = Math.max(prev + nums[i], nums[i]);
            currMax = Math.max(currMax, prev);
        }
        return currMax;
    }
}