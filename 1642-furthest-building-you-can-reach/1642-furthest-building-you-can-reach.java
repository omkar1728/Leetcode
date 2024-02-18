class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //https://www.youtube.com/watch?v=zyTeznvXCtg
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < heights.length - 1; i++){
            int diff = heights[i + 1] - heights[i];
            if(diff < 0){
                continue;
            } else {
                bricks -= diff;
                heap.add(diff);
                if(bricks < 0){
                    if (ladders == 0){
                        return i;
                    }
                    ladders--;
                    bricks += heap.poll();
                }
            }
        }
        return heights.length - 1;
    }
}