class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) return nums;

        int[] result = new int[n]; 
        Arrays.fill(result, -1);
        if(n < 2*k + 1) return result;

        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        for(int i = k; i < n - k; i++){
            int left = i - k;
            int right = i + k;

            long sum  = prefix[right];
            if(left > 0){
                sum -= prefix[left - 1];
            }
            int avg = (int) (sum/(2*k + 1));
            result[i] = avg;
        }
        return result;
    }
}