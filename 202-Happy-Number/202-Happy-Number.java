class Solution {
    public boolean isHappy(int num) {
        HashSet<Integer> set = new HashSet();
        if(num == 1) return true;
        set.add(num);
        while(true){
            num = giveSquare(num);
            if(num == 1) return true;
            if(set.contains(num)) return false;
            set.add(num);
        }
    }
    private int giveSquare(int n){
        int ans = 0;
        while(n > 0 ){
            int temp = n%10;
            n /= 10;
            ans += temp* temp;
        }
        return ans;
    }
}