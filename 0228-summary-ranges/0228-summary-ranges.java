class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        if(nums.length == 1){
            ans.add(String.valueOf(nums[0]));
            return ans;
        }

        int start = nums[0];
        int end = nums[0];
        int next = start + 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != next){
                if(start == end){
                    ans.add(String.valueOf(start));
                } else {
                    ans.add(String.valueOf(start) + "->" + String.valueOf(end));
                }
                start = nums[i];
                end = nums[i];
                next = start + 1;
            } else {
                next++;
                end = nums[i];
            }
        }
        if(start == end){
            ans.add(String.valueOf(start));
        } else {
            ans.add(String.valueOf(start) + "->" + String.valueOf(end));
        }
        return ans;
    }
}