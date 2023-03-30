class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i = 0; i < n -1; i++){
            ans = say(ans);
        }
        return ans;
    }
    private String say(String s){
        int count = 1;
        char curr = s.charAt(0);
        String ans = "";
        for(int i = 1; i < s.length(); i++){
            if(curr == s.charAt(i)){
                count += 1;
            } else{
                ans = ans + String.valueOf(count);
                ans = ans + String.valueOf(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }
        ans = ans + String.valueOf(count);
        ans = ans + String.valueOf(curr);
        return ans;

    }
}