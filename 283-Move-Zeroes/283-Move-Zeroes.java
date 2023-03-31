class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length != 1){
            int left = 0;
            int right = 0;
            while(left < nums.length && nums[left] != 0 ){
                left++;
            }
            if(left < nums.length - 1){

            right = left + 1;
            while(right < nums.length){
                if(nums[right] != 0){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right++;
                }
                else {
                    right++;
                }
            }
            }

        }
    }
}