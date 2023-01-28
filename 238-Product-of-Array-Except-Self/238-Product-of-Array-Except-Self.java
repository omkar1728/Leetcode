class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 2){
            int[] ans = new int[2];
            ans[1] = nums[0];
            ans[0] = nums[1];
            return ans;
        }
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1]*nums[i];
        }

        suffix[n - 1] = nums[n-1];
        for(int i = n - 2 ; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i];
            
        }
        ans[0] = suffix[1];
        ans[n-1] = prefix[n-2];
        for(int i = 1; i < n-1; i++){
            ans[i] = prefix[i-1] * suffix[i+1];
        }
        return ans;
        
    }
}