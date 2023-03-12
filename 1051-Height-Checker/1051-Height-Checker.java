class Solution {
    public int heightChecker(int[] heights) {
        int[] cache = new int[101];
        for(int i = 0; i < heights.length; i++){
            cache[heights[i]] += 1;
        }
        int[] sorted = new int[heights.length];
        int pointer = 0;
        for(int i = 0; i < 101; i++){
            while(cache[i] > 0){
                sorted[pointer] = i;
                pointer++;
                cache[i] -= 1;
            }
        }
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sorted[i]){
                count++;
            }
        }
        return count;
    }
}