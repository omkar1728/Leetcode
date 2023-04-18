class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        while( p1 < word1.length() && p2 < word2.length()){
            s.append(word1.charAt(p1));
            s.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        while(p1 < word1.length()){
            s.append(word1.charAt(p1));
            p1++;
        }
        while(p2 < word2.length()){
            s.append(word2.charAt(p2));
            p2++;
        }
        return String.valueOf(s);
    }
}