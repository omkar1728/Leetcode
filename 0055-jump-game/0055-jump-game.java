class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) return true;
        return jump(nums, 0);
    }
    private boolean jump(int[] nums, int start){
        int maxJump = nums[start] + start;
        int max = start;

        for(int i =  start; i <= start + nums[start] && i < nums.length; i++){
            if(nums[i] + i > maxJump){
                max = i;
                maxJump = nums[i] + i;
            }
        }
        if(max == start) return maxJump >= nums.length -1 || false;
        return maxJump >= nums.length - 1 || jump(nums, max) ;
    }

}