class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        //https://www.youtube.com/watch?v=7h90-cxIA3Q
        int mod = 1000000000 + 7;
        int[] dp = new int[high+1];
        dp[0] = 1;
        int ans = 0;
        for(int i = 1; i <= high; i++){
            if(i - one >= 0) dp[i] += dp[i - one];
            if(i - zero >= 0) dp[i] += dp[i - zero];
            dp[i] = dp[i]%mod;

            if(low <= i && i <= high){
                ans += dp[i];
                ans = ans%mod;
            }
        }
        return ans;
    }
}