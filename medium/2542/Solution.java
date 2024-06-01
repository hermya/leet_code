import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        var pQueue = new PriorityQueue<Long>();
        var list = new ArrayList<Pair>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(new Pair(nums2[i], nums1[i]));
        }
        list.sort((pair1, pair2) -> (int)(pair1.l - pair2.l));
        var x = k;
        var m = list.size() - 1;
        long sum = 0;
        while (x > 1) {
            var temp = list.get(m);
            pQueue.add(temp.r);
            sum += temp.r;
            x--;
            m--;
        }
        long ans = 0;
        while (m > -1) {
            var temp = list.get(m);
            sum += temp.r;
            pQueue.add(temp.r);
            ans = Math.max(temp.l * sum, ans);
            sum -= pQueue.poll();
            m--;
        }
        return ans;
    }
}

class Pair {
    long l;
    long r;
    Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }

    public String toString() {
        return "(" + l + ", " + r + ")";
    }
}