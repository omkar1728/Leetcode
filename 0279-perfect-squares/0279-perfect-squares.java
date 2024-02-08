class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = n;
        }
        dp[0] = 0;
        for(int target = 1; target < dp.length; target++){
            for(int j = 1; j < target + 1; j++){
                int square = j*j;
                if(square > target) break;
                dp[target] = Math.min(dp[target], 1 + dp[target - square]);
            }
        }
        return dp[n];
    }
}