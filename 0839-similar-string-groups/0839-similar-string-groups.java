class Solution {
    int groups = 0;
    HashMap<String,ArrayList<String>> map = new HashMap<>();
    HashSet<String> visited = new HashSet<>();
    public int numSimilarGroups(String[] strs) {
        for(int i = 0; i < strs.length; i++){
            ArrayList<String> temp = new ArrayList<>();
            map.put(strs[i],temp);
        }
        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; j++){
                if(isSimilar(strs[i],strs[j])){
                    map.get(strs[i]).add(strs[j]);
                    map.get(strs[j]).add(strs[i]);
                }
            }
        }
        for(int i = 0; i  < strs.length; i++){
            if(!visited.contains(strs[i])){
                groups++;
                visited.add(strs[i]);
                visit(strs[i]);
            }
        }
        return groups;   
    }
    private boolean isSimilar(String a, String b){
        if(a.length() != b.length()) return false;
        if(a.equals(b)) return true;
        int diff = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
        }
        if(diff <= 2) return true;
        return false;
    }
    private void visit(String s){
        for(String x : map.get(s)){
            if(!visited.contains(x)){
                visited.add(x);
                visit(x);

            }
        }
    }
}