class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;
        int p = 1;
        while(n  > 0 ){
            int last = n%10;
            n /= 10;
            s += last;
            p *= last;
        }
        return p - s;
    }
}