class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long n = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                n++;
            } else {
                ans += ( n * (n+1) )/2;
                n = 0;
            }
        }
        if(n != 0 ){
            ans += ( n * (n+1) )/2;

        }
        return ans;   
    }
}