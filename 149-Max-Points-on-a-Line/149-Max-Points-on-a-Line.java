class Solution {
    public int maxPoints(int[][] points) {
        //the mode of slopes + 1 from a point to all other points is the number of lines 
        //with same slope through that point
        //step1- consider ith point
        //step2 - calculate slope to all next points
        //step3 - determine mode of slopes
        //step4 - add plus one to get number of lines and return it\
        //dry run case 2 to understand better
        int n = points.length;
        int ans;
        if(n==1 || n==2) {
            return n;      
        }
        ans=0;
        for(int i = 0 ; i < n ; i++){
            int modeSlope = 0;
            HashMap<Double,Integer> map = new HashMap<>();
            for(int j=i+1 ;j<n; j++)
            {
                double slope = getSlope(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(map.containsKey(slope))
                {
                    map.put( slope , map.get(slope)+1 );
                    modeSlope = Math.max(modeSlope,map.get(slope));
                }
                else map.put(slope,1);
            }
            if(modeSlope == 0) {
                modeSlope =2;
            }
            else{
                modeSlope += 1;
            } 
            ans = Math.max(ans,modeSlope);
        }
    return ans;
    }
    private static double getSlope(int x1, int y1, int x2, int y2){
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        if (y2 == y1){
            return (double) (0);
        }
        if(xDiff == 0){
            return Double.MAX_VALUE;
        }
        return (double) (y2 - y1) / (double) (x2 - x1);
    }
}