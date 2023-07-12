class Solution {
    HashSet<Integer> safe = new HashSet<>();
    public List<Integer> eventualSafeNodes(int[][] graph) {
        for(int i = 0; i < graph.length; i++){
            if(graph[i].length == 0) safe.add(i);
        }
        boolean changed = true;
        while(changed){
            changed = false;
            for(int i = 0; i < graph.length; i++){
                if(!safe.contains(i)){
                    boolean valid = true;
                    for(int j : graph[i]){
                        valid = valid && safe.contains(j);
                    }
                    if(valid){
                        safe.add(i);
                        changed = true;
                    }
                }
            }    
        }
        List<Integer> ans = new ArrayList<>(safe);
        Collections.sort(ans);
        return ans;

    }
}