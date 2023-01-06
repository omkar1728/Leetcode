class Solution {
    static boolean canWalk = false;
    static int count = 0;
    public int numEnclaves(int[][] grid) {
        int total = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    floodFill(grid, i, j);
                }
                if(!canWalk){
                    total += count;
                }
                count = 0;
                canWalk = false;
            }
        }
        return total;
        
    }
    private static void floodFill(int[][] grid, int i, int j){
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            canWalk = true;
            return;
        }
        if(grid[i][j] == 2 || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 2;
        count++;
        floodFill(grid, i + 1, j);
        floodFill(grid, i - 1, j);
        floodFill(grid, i, j + 1);
        floodFill(grid, i, j - 1);
    }
}