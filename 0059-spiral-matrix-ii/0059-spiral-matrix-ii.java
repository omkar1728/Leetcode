class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        int xend = n - 1;
        int xstart = 0;
        int yend = n - 1;
        int ystart = 0;

        while(xstart <= xend && ystart <= yend){
            //right

            for(int i = ystart; i <= yend; i++){
                ans[xstart][i] = count;
                count++;
            }
            xstart++;
            //down
            for(int i = xstart; i <= xend; i++){
                ans[i][yend] = count;
                count++;
            }
            yend--;
            //left
            for(int i = yend; i >= ystart; i--){
                ans[xend][i] = count;
                count++;
            }
            xend--;
            for(int i = xend; i >= xstart; i--){
                ans[i][ystart] = count;
                count++;
            }
            ystart++;
            
            //down
        }


        return ans;
    
    }
}