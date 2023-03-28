class Solution {
    public int minStartValue(int[] nums) {
        
        int n  = 1;
        boolean neg = false;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) neg = true;
            n += nums[i];
            min = Math.min(min, n);
        }
        if(neg == false) return 1;
        if(min >= 1) return 1;
        return 2 - min;
    }
}