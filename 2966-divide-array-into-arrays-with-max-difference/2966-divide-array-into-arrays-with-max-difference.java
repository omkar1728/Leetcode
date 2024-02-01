class Solution {
    int[][] ans;
    int[][] def = new int[0][];
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][];
        Arrays.sort(nums);
        for(int i = 0; i < ans.length; i++){
            int[] temp = new int[3];
            temp[0] = nums[3*i];
            temp[1] = nums[3*i + 1];
            temp[2] = nums[3*i + 2];
            if(temp[2] - temp[1] > k || temp[1] - temp[0] > k || temp[2] - temp[0] > k){
                return def;
            }
            ans[i] = temp;
        }
    return ans;
    }
}