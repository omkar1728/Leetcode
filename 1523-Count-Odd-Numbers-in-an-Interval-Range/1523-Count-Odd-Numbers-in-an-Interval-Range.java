class Solution {
    public int countOdds(int low, int high) {
        if(high - low == 1) return 1;
        // int count =  (high - low)/2;
        // if(high%2 != 0) return count + 1;
        // return count;
        if(low%2 == 0) low++;
        if(high%2==0) high--;
        return (high - low)/2 + 1;
    }
}