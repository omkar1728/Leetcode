class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] cache = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            cache[nums[i]] += 1;
        }
        int[] ans = new int[2];
        for(int i = 1; i < cache.length; i++){
            if(cache[i] == 2) ans[0] = i;
            if(cache[i] == 0) ans[1] = i;
        }
        return ans;


    }
}