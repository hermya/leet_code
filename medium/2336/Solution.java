import java.util.PriorityQueue;

class SmallestInfiniteSet {
    PriorityQueue<Integer> pQueue;
    int ctr = 0;
    public SmallestInfiniteSet() {
        pQueue = new PriorityQueue<>();
        ctr++;
    }
    
    public int popSmallest() {
        if (pQueue.isEmpty()) {
            ctr++;
            return ctr - 1;
        }
        var smaller = Math.min(ctr, pQueue.peek());
        if (smaller == ctr) {
            ctr++;
            return smaller;
        } 
        return pQueue.poll();
    }
    
    public void addBack(int num) {
        if (num < ctr && !pQueue.contains(num)) {
            pQueue.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */