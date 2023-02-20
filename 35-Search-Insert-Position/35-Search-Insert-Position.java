class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start )/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                end = mid -1;
            }
            else if (nums[mid] < target){
                start = mid +1;
            }
        }
        // if (nums[start] < target){
        //     return start + 1;
        // }
        // else{
        //    if(nums[ start -1] < target){
        //        return start;
        //    }
        //    else{
        //        return start -1;
        //    }
        // }
        if(nums[start] < target){
            return start+1;
        }
        return start;
    }
}