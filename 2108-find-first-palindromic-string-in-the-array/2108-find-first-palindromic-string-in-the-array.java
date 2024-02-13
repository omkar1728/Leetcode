class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPal(word)) return word;
        }
        return "";
    }
    private boolean isPal(String s){
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}