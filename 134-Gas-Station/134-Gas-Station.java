class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        for(int i = gas.length - 1; i >= 0; i--){
            if(canDo(gas, cost, i)){
                return i;
            }
        }
        return -1;
    }
    private static boolean canDo(int[] gas, int cost[], int pos){
        int fuel = 0;
        int dest = pos;
        do{
            fuel += gas[pos];
            if(fuel >= cost[pos]){
                fuel -= cost[pos];
                if(pos == gas.length -1){
                    pos = 0;
                } else {
                    pos++;
                }
            } else{
                return false;
            }

        }while(pos != dest);
        return true;
    }
}