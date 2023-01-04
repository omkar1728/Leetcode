class Solution {
    static boolean SubIsland = true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int subIsland = 0;
        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[0].length; j++){
                if(grid2[i][j] == 1){
                    floodFill(grid1, grid2, i, j);
                    if(SubIsland){
                        subIsland++;
                    }
                    SubIsland = true;
                } 
            }
        }
        return subIsland;
        
    }
    public static void floodFill(int grid1[][], int grid2[][], int i, int j){
        if(i < 0 || j < 0 || i >=grid2.length || j >= grid2[0].length){
            return;
        }
        if(grid2[i][j] == 2 || grid2[i][j] == 0){
            return;
        }
        grid2[i][j] = 2;
        if(grid1[i][j] == 0){
            SubIsland = false;
        }
        floodFill(grid1, grid2, i + 1, j);
        floodFill(grid1, grid2, i - 1, j);
        floodFill(grid1, grid2, i, j + 1);
        floodFill(grid1, grid2, i, j - 1);
    }
}