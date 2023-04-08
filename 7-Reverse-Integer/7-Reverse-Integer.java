class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        int sign = 1;
        if(x < 0){
            sign = -1;
            x  *= -1;
        }
        int ans = 0;
        while(x > 0){
            int last = x%10;
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && last > 7)) return 0;
        if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && last < -8)) return 0;
            ans = ans*10 + last;
            x = x/10;
        }
        return ans * sign;


    }
}