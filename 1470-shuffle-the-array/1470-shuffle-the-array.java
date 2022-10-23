class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i = 0; i < n; i++){
            arr[i*2] = nums[i]; 
        }
        
        for(int i = 1; i < n+1; i++){
            arr[i*2 -1 ] = nums[i+n-1]; 
        }
        return arr;
        
    }
}