class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c) return mat; 
        int[][] ans = new int[r][c];
        int x = 0;
        int y = 0;
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                ans[i][j] = mat[x][y];
                y++;
                if(y == mat[0].length){
                    y = 0;
                    x++;
                }
            }
        }
        return ans;
    }
}