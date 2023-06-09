class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //https://www.youtube.com/watch?v=uZKCnU0ynNw
        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0];
        while(left <= right){
            int mid = left + (right - left)/2;
            if(letters[mid] == target){
                left = mid + 1;
            }
            else if( (int) (letters[mid]) < (int) (target) ){
                left = mid + 1;
            } else {
                ans = letters[mid];
                right = mid - 1 ;
            }
        }
        return ans;
    }
}