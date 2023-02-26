class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int bucket = capacity;
        for(int i = 0; i < plants.length; i++){
            steps += 1;
            if(plants[i] > bucket){
                steps += 2*i ;
                bucket = capacity;
            }
            bucket -= plants[i];
        }
        return steps;
    }
}