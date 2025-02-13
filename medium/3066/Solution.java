import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
		
		for (int num : nums) {
			pq.add((long)num);
		}
		
		int numOfOps = 0;
		
		while (!pq.isEmpty()) {
			if (pq.peek() >= k) {
				break;
			}
			
			numOfOps++;
			
			if (pq.size() < 2) {
				return -1;
			} else {
				long a = pq.poll();
				long b = pq.poll();
				pq.add(2 * Math.min(a, b) + Math.max(a, b));
			}
		}
		
		return numOfOps;
    }
}