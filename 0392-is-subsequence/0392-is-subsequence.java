class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int p = 0;
        for(int i = 0; i < t.length(); i++){
            if(p == s.length()) return true;
            if(t.charAt(i) == s.charAt(p)) p++;
        }
        return p == s.length();
    }
}