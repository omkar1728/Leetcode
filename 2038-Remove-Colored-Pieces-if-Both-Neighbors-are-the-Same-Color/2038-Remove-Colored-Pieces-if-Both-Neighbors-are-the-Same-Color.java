class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = giveCount('A', colors);
        int bob = giveCount('B', colors);
        if(alice > bob) return true;
        return false;
        
    }
    private int giveCount(char c, String colors){
        int count = 0;
        int player = 0;
        for(int i = 0 ; i < colors.length(); i++){
            if(colors.charAt(i) == c){
                count += 1;
            } else{
                if(count >= 3){
                    player += count - 2;
                }
                count = 0;
            }
        }
        if(count >= 3){
            player += count - 2;
        }
        return player;
    }
}