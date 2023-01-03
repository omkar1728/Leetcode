class Solution {
    static char marked = '2';
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    floodFill(grid, i, j);
                }
            }
        }
        return count;
    }
    private static void floodFill(char[][] grid, int i, int j){
        if(i < 0 || i>= grid.length){
            return;
        }
        if(j < 0 || j>= grid[0].length){
            return;
        }
        if(grid[i][j] == marked || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = marked;
        floodFill(grid, i + 1, j);
        floodFill(grid, i - 1, j);
        floodFill(grid, i, j + 1);
        floodFill(grid, i, j - 1);
    }
}