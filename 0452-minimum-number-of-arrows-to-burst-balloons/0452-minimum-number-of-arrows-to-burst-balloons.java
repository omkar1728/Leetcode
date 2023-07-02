class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1])); 
        // Arrays.sort(points, new Comparator<int[]>(){
        //     @Override
        //     public int compare(int[] entry1, int[] entry2){
        //         if(entry1[1] > entry2[1]){
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // });     
        int end = points[0][1];
        int arrows = 1;
        for(int i = 1; i < points.length; i++){
            if(end < points[i][0]){
                end = points[i][1];
                arrows++;
            }
        }
        return arrows;
    }
}