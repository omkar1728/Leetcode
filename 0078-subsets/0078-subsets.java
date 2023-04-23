class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        make(nums, 0, new ArrayList<Integer>());
        return ans;

    }
    private void make(int[] nums, int i, ArrayList<Integer> source){
        if(i >= nums.length){
            ans.add(source);
            return;
        }
        ArrayList<Integer> notChoose = new ArrayList<Integer>();
        notChoose.addAll(source);
        make(nums, i+1, notChoose);

        ArrayList<Integer> Choose = new ArrayList<Integer>();
        Choose.addAll(source);
        Choose.add(nums[i]);
        make(nums, i + 1, Choose);

    }

    
}