class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = 0;
        int curr = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                curr = 0;
                while(set.contains(i+curr)){
                    curr++;
                } 
                ans = Math.max(curr ,ans );
            }
        }
        return Math.max(ans,curr);
    }
}