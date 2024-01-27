class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        int ans = 0;
        int child = 0;
        int cookie = 0;
        Arrays.sort(greed);
        Arrays.sort(size);
        while(child < greed.length && cookie < size.length){

            if(greed[child] <= size[cookie]){
                ans += 1;
                child++;
                cookie++;
            } else {
                cookie++;
            }
        }

        return ans;
    }
}