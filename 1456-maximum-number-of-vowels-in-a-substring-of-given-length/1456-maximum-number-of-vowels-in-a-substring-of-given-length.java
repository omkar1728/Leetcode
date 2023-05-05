class Solution {
    HashSet<Character> vowels = new HashSet<>();
    public int maxVowels(String s, int k) {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = cv(s,0,k-1);
        int max = count;
        
        for(int i = 1 ; i + k - 1< s.length() ; i++ ){
            if(vowels.contains(s.charAt(i+k-1))) count++;
            if(vowels.contains(s.charAt(i-1))) count--;
            max = Math.max(max,count);
        }
        return max; 
    }
    private int cv(String s, int start, int end){
        int count = 0;
        for(int i = start; i <= end; i++){
            if(vowels.contains(s.charAt(i))) count++;
        }
        return count;

    }
}