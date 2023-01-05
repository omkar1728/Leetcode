class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] entry1, int[] entry2){
                if(entry1[1] > entry2[1]){
                    return 1;
                } else {
                    return -1;
                }
            }
        });    
        for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[i].length; j++) {
        System.out.print(points[i][j] + " ");
      }
      System.out.println();
    }  
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