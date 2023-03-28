class Solution {
    public int countBinarySubstrings(String s) {
        //https://www.youtube.com/watch?v=rhotywtQ1KE
        if(s.length() == 1) return 0;
        int count = 0;
        char curr = s.charAt(0);
        ArrayList<Integer> cache = new ArrayList<>();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == curr){
                count++;
            } else {
                curr = s.charAt(i);
                cache.add(count);
                count = 1;
            }
        }
        cache.add(count);
        count = 0;
        if(cache.size() == 0 ) return 0;
        for(int i = 1; i < cache.size(); i++){
            count += Math.min(cache.get(i-1), cache.get(i));
        } 
        
        return count;    
    }

}