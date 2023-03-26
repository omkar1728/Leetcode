class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2) return nums;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] ans = new int[2];
        int pointer = 0;
        for(Integer i : set){
            ans[pointer] = i;
            pointer++;
        }
        return ans;

    }
}