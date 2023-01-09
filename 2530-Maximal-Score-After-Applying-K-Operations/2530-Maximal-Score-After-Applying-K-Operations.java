class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        long ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            q.add(nums[i]);
        }
        for(int i = 0; i < k; i++){
            int max = q.poll();
            ans += max;
            max = (int) Math.ceil( (double) max/3 );
            q.add(max);

         }
        return ans;
    }
   
}