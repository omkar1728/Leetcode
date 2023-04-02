class Solution {
    public int minMoves(int[] nums) {
        //https://www.youtube.com/watch?v=7ASUzYC2B3Y
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min,nums[i]);
            sum += nums[i];
        }
        return sum - nums.length * min;
    }
}