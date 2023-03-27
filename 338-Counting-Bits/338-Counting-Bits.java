class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i < n+1; i++){
            ans[i] = numOfOne(i);
        }
        return ans;
    }
    private int numOfOne(int n){
        int count = 0;
        while(n != 0){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}