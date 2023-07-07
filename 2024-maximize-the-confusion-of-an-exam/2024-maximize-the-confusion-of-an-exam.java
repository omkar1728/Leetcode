class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //https://www.youtube.com/watch?v=03ECK39B-aw
        int ans = Math.max(give(answerKey, k, 'F'), give(answerKey, k, 'T'));
        return ans;
    }
    private int give(String s, int k, char key){
        int ans = 0;
        int count = 0;
        int left = 0; 
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == key) count++;
            while(count > k){
                if(s.charAt(left) == key) count--;
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}