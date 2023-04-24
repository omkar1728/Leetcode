class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < stones.length; i++){
            q.add(stones[i]);
        }
        while(q.size() > 1){
            int heavy = q.poll();
            int light = q.poll();
            if(heavy  > light){
                q.add(heavy - light);
            }
            
        }
        if(q.isEmpty()) return 0;
        return q.poll();
    }
}