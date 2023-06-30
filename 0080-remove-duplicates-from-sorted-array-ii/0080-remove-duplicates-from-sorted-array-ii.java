class Solution {
    public int removeDuplicates(int[] nums) {
        //https://www.youtube.com/watch?v=ycAq8iqh0TI
        int left = 0;
        int right = 0;
        while(right < nums.length){
            int count = 1;
            while(right + 1 < nums.length && nums[right] == nums[right + 1]){
                right++;
                count++;
            }
            count = Math.min(count, 2 );
            while(count > 0){
                nums[left] = nums[right];
                left++;
                count--;
            }
            right++;
        }
        return left;

    }
}