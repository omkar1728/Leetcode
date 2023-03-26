class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = -1;
        int min = 100000;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        if(max - min <= 2*k){
            return 0;
        }
        else{
            max -= k;
            min += k;
        }
        return max - min;
    }
}