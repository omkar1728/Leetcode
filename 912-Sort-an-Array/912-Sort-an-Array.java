class Solution {
    public int[] sortArray(int[] nums) {
        int offset = 100000;
        int[] cache = new int[offset*2  + 1];
        for(int i = 0; i < nums.length; i++){
            cache[nums[i] + offset] += 1;
        }
        int pointer = 0;
        for(int i = 0; i < cache.length; i++){
            for(int j = 0; j < cache[i]; j++){
                nums[pointer ] = i - offset;
                pointer++;
            }
        }
        return nums;
    }
}