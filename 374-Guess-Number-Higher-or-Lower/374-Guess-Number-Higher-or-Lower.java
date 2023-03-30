/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        while(low <= high){
            int pick = low + (high - low)/2;
            if(guess(pick) == 0){
                return pick;
            }
            else if (guess(pick) == 1){
                low = pick + 1;
            } else {
                high = pick -1;
            }
        }
        return 0;
    }
}