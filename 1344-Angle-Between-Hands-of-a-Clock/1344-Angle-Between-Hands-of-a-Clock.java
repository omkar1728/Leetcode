class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;
        double hourAngle = 30 * hour + 0.5*minutes;
        double minuteAngle = 6 * minutes;
        double p1 =  Math.abs(minuteAngle - hourAngle);
        double p2 =  360 - Math.abs(minuteAngle - hourAngle);

        return Math.min(p1,p2);
    }
}