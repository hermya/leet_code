public class O1Solution {
    public void rotate(int[] nums, int k) {
        var n = nums.length;
        if (k % n == 0) {
            return;
        }
        k = k % n;
        int i = 0;
        var c = 0;
        var res = i;
        var s = nums[res];
        var t = -1;
        i = (i + k)%n;
        while (c < n) {
            while (i != res) {
                t = nums[i];
                nums[i] = s;
                s = t;
                i = (i + k)%n;
                c++;
            }
            nums[i] = s;
            c++;
            i++;
            res = i;
            i = (i + k)%n;
            s = nums[res];
        }
    }
}