class Solution {
    int ans = Integer.MAX_VALUE;
    public int minSubArrayLen(int target, int[] nums) {
        //https://www.youtube.com/watch?v=aYqYMIqZx5s
        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum +=  nums[right];
            while (sum >= target){
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(ans > nums.length) return 0;
        return ans;
    }
}