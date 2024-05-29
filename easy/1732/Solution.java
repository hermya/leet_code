class Solution {
    public int largestAltitude(int[] gain) {
        var max = 0;
        var alt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt = alt + gain[i];
            max = Math.max(max, alt);
        }   
        return max;
    }
}