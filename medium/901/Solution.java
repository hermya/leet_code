import java.util.LinkedList;

class StockSpanner {
    LinkedList<Integer> stack;
    LinkedList<Integer> stack2;
    int lastPopped = 0;
    public StockSpanner() {
        stack = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }
    
    public int next(int price) {
        var ans = 1;
        while (!stack.isEmpty() && price >= stack.peekLast()){
            ans += stack2.pollLast();
            stack.pollLast();
        }
        stack.addLast(price);
        stack2.addLast(ans);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */