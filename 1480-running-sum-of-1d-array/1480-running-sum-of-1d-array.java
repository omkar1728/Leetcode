class Solution {
    public int[] runningSum(int[] nums) {
        int currSum = nums[0];
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i  = 1; i< nums.length ; i++){
            currSum = currSum + nums[i];
            arr[i] = currSum;
        }
        return arr;
    }
}