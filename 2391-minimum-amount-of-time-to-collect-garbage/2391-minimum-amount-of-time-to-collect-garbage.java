class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int curr = travel[0];
        for(int i = 1; i < travel.length; i++){
            travel[i] += travel[i-1];
        }

        int paper = -1;
        int glass = -1;
        int metal = -1;
        int ans = 0;
        for(int i = 0; i < garbage.length; i++){
            String[] temp = garbage[i].split("");
            for(String j : temp){
                if (j.equals("G")) glass = i;
                if (j.equals("P")) paper = i;
                if (j.equals("M")) metal = i;
                ans += 1;
            }
        }
        if(glass > 0){
            ans += travel[glass - 1];
        }
        if(paper > 0){
            ans += travel[paper - 1];
        }
        if(metal > 0){
            ans += travel[metal - 1];
        }
        
        return ans;
    }
}