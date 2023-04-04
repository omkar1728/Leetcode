class Solution {
    public int partitionString(String s) {
        boolean[] set = new boolean[26];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if (set[(int) (s.charAt(i)) - 97]){
                count += 1;
                set = new boolean[26];

            } 
            set[(int) (s.charAt(i)) - 97] = true;
            
        }
        return count + 1;
    }
}