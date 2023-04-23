class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            ans.add(isAri(nums, l[i] , r[i] ));
        }
        return ans;
    }
    private boolean isAri(int[] nums, int start, int end){
        if(end - start + 1 <= 1) return true;
        int[] temp = new int[end - start + 1];
        for(int i = start; i <= end; i++){
            temp[i-start] = nums[i];
        }
        Arrays.sort(temp);
        int diff = temp[1] - temp[0];
        for(int i = 2; i < temp.length; i++){
            if(temp[i] - temp[i-1] != diff) return false;
        }
        return true;
    }

}