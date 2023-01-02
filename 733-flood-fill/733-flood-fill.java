class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        flood(image, sr,sc,color, image[sr][sc]);
        return image;
    }
    private static void flood(int[][] image, int sr, int sc, int color, int og){
        if(sr<0 || sr>=image.length){
            return;
        }
        if(sc<0 || sc>=image[0].length){
            return;
        }
        if(image[sr][sc] == color){
            return;
        }
        if (image[sr][sc] == og){
            image[sr][sc] = color;
        } else {
            return;
        }
        flood(image, sr + 1, sc, color, og);
        flood(image, sr - 1, sc, color, og);
        flood(image, sr, sc +  1, color, og);
        flood(image, sr, sc - 1 , color, og);

    }
}