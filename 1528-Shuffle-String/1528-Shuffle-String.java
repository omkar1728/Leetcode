class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            ans.append('x');
        }
        System.out.println(ans);
        for(int i = 0; i < s.length(); i++){
            ans.setCharAt(indices[i], s.charAt(i));
        }
        return String.valueOf(ans);
    }
}