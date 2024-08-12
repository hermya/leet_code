import java.util.PriorityQueue;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        var pQueue = new PriorityQueue<Integer>();
        var negNums = 0;
        for (int i = 0; i < nums.length; i++) {
            pQueue.add(nums[i]);
            negNums += nums[i] < 0 ? 1 : 0;
        }
        var ans = 0;
        
        while (!pQueue.isEmpty()) {
            var temp = pQueue.poll();
            if (k > 0) {
                if (temp < 0 && negNums > 1) {
                    ans += Math.abs(temp);
                    negNums--;
                    k--; 
                } else if (temp < 0 && negNums == 1 && k > 1 && !pQueue.isEmpty()) {
                    var kIsEven = k % 2 == 0;
                    var front = pQueue.poll();
                    if (kIsEven) {
                        if (Math.abs(front) > Math.abs(temp)) {
                            ans += front;
                            ans += temp;
                        } else {
                            ans += -1 * Math.abs(front);
                            ans += Math.abs(temp);
                        }
                    } else {
                        ans += Math.abs(temp) + front;
                    }
                    k = 0;
                    negNums = 0;
                } else {
                    while (k > 0) {
                        temp *= -1;
                        k--;
                    }
                    ans += temp;
                }
            } else {
                ans += temp;
            }
        }
        return ans;
    }
}

