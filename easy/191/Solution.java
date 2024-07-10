class Solution {
    public int hammingWeight(int n) {
        var num = 0;
        while (n > 0) {
            num += n%2;
            n = n/2;
        }
        return num;
    }
}