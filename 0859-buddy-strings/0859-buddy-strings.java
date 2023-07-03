class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int count = 0;
        ArrayList<Integer> diff = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        boolean duplicate = false;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                duplicate = true;
            } else {
                set.add(s.charAt(i));
            }
            if(s.charAt(i) != goal.charAt(i)){
                 count++;
                 diff.add(i);
            }
            if(count > 2) return false;
        }
        if(count == 2){
            if(s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
            && s.charAt(diff.get(1)) == goal.charAt(diff.get(0))) return true;
        }
        if(count == 0 && duplicate){
            return true;
        } else {
            return false;
        }
    }
}