class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        for(int i = 0; i < word1.length; i++){
            for(int j = 0; j < word1[i].length(); j++){
                l1.add(word1[i].charAt(j));
            }
        }
        for(int i = 0; i < word2.length; i++){
            for(int j = 0; j < word2[i].length(); j++){
                l2.add(word2[i].charAt(j));
            }
        }
        if(l1.size() != l2.size()) return false;
        for(int i = 0; i < l1.size(); i++){
            if(l1.get(i) != l2.get(i)) return false;
        }
        
        return true;
    }
}