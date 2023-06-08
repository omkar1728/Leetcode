class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int end = grid[0].length;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < end; j++){
                if(grid[i][j] < 0){
                     end = j;
                     break;
                }
            }
            count += grid[0].length - end;
        }

        return count;
    }
}