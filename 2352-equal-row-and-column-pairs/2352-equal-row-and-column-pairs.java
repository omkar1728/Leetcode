class Solution {
    int count = 0;
    public int equalPairs(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][0] == grid[0][j]){
                    if(isSame(grid, i, j )) count++;
                }
            }
        }
        return count;
    }
    private boolean isSame(int[][] grid, int x, int y){
        for(int i = 0; i < grid.length; i++){
            if(grid[x][i] != grid[i][y]) return false;
        }
        return true;
    }

}