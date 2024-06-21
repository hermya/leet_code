public class ONSolution {
    public void rotate(int[] nums, int k) {
        var n = nums.length;
        k = k % n;
        var cache = new int[k];
        for (int i = 0; i < k; i++) {
            cache[i] = nums[n - k + i]; 
        }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = cache[i];
        }
    }
}