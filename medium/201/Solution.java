class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int last = 2147483647;
        int r = right;
        long val = 1;
        while (left + val <= r) {
            last = last - (int)val;
            right = right & last & left;
            val = val * 2;
        }
        return right;
    }
}