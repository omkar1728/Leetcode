class Solution {
    static boolean closed = true;
    public int closedIsland(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    floodFill(grid, i,  j);
                    if(closed){
                        count++;
                    }
                }
                closed = true;
            }

        }
        return count;
    }
    public static void floodFill(int[][] grid, int i, int j){
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            closed = false;
            return;
        }
        if(grid[i][j] == 1 || grid[i][j] == 2){
            return;
        }
        grid[i][j] = 2;
        floodFill(grid, i + 1 , j);
        floodFill(grid, i - 1 , j);
        floodFill(grid, i , j + 1);
        floodFill(grid, i , j - 1);
    }
}