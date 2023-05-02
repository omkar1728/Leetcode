class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < points.length ; i++){
            if(points[i][0] == x || points[i][1] == y){
                if(man(x ,y , points[i][0], points[i][1]) < min){
                    index = i;
                    min = man(x ,y , points[i][0], points[i][1]);
                    //System.out.println(min);
                }
            }
        }

        //System.out.println(man(3,4,3,1));
        return index;
    }

    private int man(int x1, int y1, int x2, int y2){
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}