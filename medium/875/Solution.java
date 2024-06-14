class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        var max = 0;
        for (int num : piles) {
            max = Math.max(max, num);
        }
        var min = 1;
        var avg = 0;
        var hours = 0l;
        var minB = max;
        while (max >= min) {
            avg = (max + min)/2;
            //System.out.println("min=" + min +" max=" + max + " avg=" + avg);
            hours = 0;
            for (int num : piles) {
                hours += (num + avg) % avg == 0 ? num / avg : (num + avg)/avg;
            }
            //System.out.println("hours = " + hours);   
            if (hours <= h) {
                max = avg - 1;
                minB = Math.min(minB, avg);
                //System.out.println("bananas = " + minB);
            } else {
                min = avg + 1;
            }
        }
        return minB;
    }
}