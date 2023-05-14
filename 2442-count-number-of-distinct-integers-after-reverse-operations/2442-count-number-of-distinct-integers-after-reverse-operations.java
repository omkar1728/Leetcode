class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
            set.add(rev(i));
        }
        return set.size();
    }
    private int rev(int n){
        int ans = 0;
        while(n > 0){
            ans = ans*10 + n%10;
            n /= 10;
        } 
        return ans;
    }
}