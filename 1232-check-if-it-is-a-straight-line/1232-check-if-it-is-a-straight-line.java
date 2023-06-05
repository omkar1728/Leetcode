class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length <= 2 ) return true;
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        double slope = cal(coordinates[1][0],coordinates[1][1],x,y);
        for(int i = 2 ; i < coordinates.length; i++){
            double temp = cal(coordinates[i][0],coordinates[i][1],x,y);
            if(temp != slope) return false;
        }
        return true;
    }
    private double cal(int x, int y, int a, int b){
        if(x - a == 0) return Float.MAX_VALUE;
        double temp = ((y - b) * 1.0)/((x - a) * 1.0);
        return temp; 
    }
}