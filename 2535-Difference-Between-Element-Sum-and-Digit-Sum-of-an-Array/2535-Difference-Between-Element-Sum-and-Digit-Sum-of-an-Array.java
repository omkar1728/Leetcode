class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digit = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            digit += digitSum(nums[i]);
        }
        if (sum - digit < 0){
            return -1 * (sum - digit);
        }
        return sum - digit;
    }
    private int digitSum(int n){
        int sum = 0;
        while(n > 0 ){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}