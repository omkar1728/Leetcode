class Solution {
    public boolean digitCount(String num) {
        if(num.length() == 1) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <= 10; i++ ){
            map.put(i, 0);
        }
        for(int i = 0; i < num.length(); i++){
            int temp = num.charAt(i) - '0';
            map.put(temp, map.get(temp) + 1 );
            
        }
        for(int i = 0; i < num.length(); i++){
            int temp = num.charAt(i) - '0';
            if(map.get(i) != temp) return false;

        }
        return true;
    }
}