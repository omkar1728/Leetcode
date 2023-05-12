class Solution {
    long[] dp;
    long[] currMax;
    public long mostPoints(int[][] questions) {
        if(questions.length == 1) return questions[0][0];
        dp = new long[questions.length];
        currMax = new long[questions.length];
        dp[questions.length - 1] = questions[questions.length - 1][0];
        currMax[questions.length - 1] = dp[questions.length - 1];
        for(int i = questions.length - 2; i >= 0; i--){
            dp[i] = questions[i][0];
            if(i + questions[i][1] + 1 < dp.length){
                dp[i] += currMax[i + questions[i][1] + 1];
            }
            currMax[i] = Math.max(currMax[i+1], dp[i]);
        }
        return currMax[0];
    }
    private long giveMax(int k){
        long m = -1;
        for(int i = k; i < dp.length; i++){
            m = Math.max(m, dp[i]);
        }
        return m;
    }
}