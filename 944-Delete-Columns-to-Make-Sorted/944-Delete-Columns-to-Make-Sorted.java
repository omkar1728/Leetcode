class Solution {
    public int minDeletionSize(String[] strs) {
        boolean flag = false;
        int count = 0;
        for(int i = 0; i < strs[0].length() ; i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j-1].charAt(i) > strs[j].charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                count++;
                flag = false;
            }  
        }
        return count;
    }
}