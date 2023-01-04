class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i], map.get(tasks[i]) + 1);
            } else {
                map.put(tasks[i], 1);
            }
        }
        if(map.containsValue(1)){
            return -1;
        }
        int rounds = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            while(e.getKey() != 0){
                if( e.getValue() == 4 ){
                    rounds += 2;
                    map.put(e.getKey(), 0);
                    break;
                }
                if( e.getValue() == 2 || e.getValue() == 3 ){
                    rounds++;
                    map.put(e.getKey(), 0);
                    break;
                }
                
                map.put(e.getKey(), e.getValue() - 3);
                rounds++;
            } 
        }
        return rounds;
    }
}