class Solution {
    int ans = 0;
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            lis[i] = 1;
        }
        for(int i = nums.length - 1; i >= 0; i--){
            for(int j = i; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
            ans = Math.max(ans, lis[i]);
        }
        return ans;
    }
}