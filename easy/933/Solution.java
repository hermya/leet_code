import java.util.LinkedList;

class RecentCounter {
    LinkedList<Integer> queue;
    public RecentCounter() {
         queue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        if (queue.isEmpty()) {
            queue.addLast(t);
        } else {
            queue.add(t);
            var range = t - 3000;
            while (!queue.isEmpty() && queue.peekFirst() < range) {
                queue.pollFirst();
            }
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */