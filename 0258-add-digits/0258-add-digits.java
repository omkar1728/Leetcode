class Solution {
    public int addDigits(int num) {
        return res(num);
    }
    private int res(int num){
        if (num <10 ) return num;
        int temp = 0;
        while(num > 0 ){
            temp += num%10;
            num = num/10;
        }
        return res(temp);
    }
}