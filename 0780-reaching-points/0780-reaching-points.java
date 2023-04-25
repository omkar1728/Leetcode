class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(tx >= sx && ty >= sy){
            if(tx == sx && ty == sy) return true;
            if(tx == sx){
                if( (ty-sy)%sx == 0) return true;
                return false;
            }
            if(ty == sy){
                if( (tx-sx)%sy == 0) return true;
                return false;
            }
            if(ty >= tx){
                ty = ty % tx;
            } else {
                tx = tx % ty;
            }
        }


        return false;
    }
}