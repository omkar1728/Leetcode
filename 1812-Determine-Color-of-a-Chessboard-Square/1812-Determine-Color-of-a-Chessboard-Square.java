class Solution {
    public boolean squareIsWhite(String coordinates) {
       return ((int) (coordinates.charAt(0)) + (int) (coordinates.charAt(1)) ) % 2 != 0;
    }
}
