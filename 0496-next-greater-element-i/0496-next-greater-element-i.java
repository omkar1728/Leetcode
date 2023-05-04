class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = -1;
        }

        for(int i = 0 ; i < nums1.length; i++){
            int index = find(nums2, nums1[i]);
            for(int j = index + 1; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
    private int find(int[] nums2, int e){
        for(int i = 0 ; i  < nums2.length; i++){
            if(nums2[i] == e  ) return i;
        }
        return -1;
    }
}