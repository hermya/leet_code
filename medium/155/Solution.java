import java.util.LinkedList;

class MinStack {
    LinkedList<Integer> list = new LinkedList<>(); 
    LinkedList<Integer> mList = new LinkedList<>(); 
    public MinStack() {
        
    }
    
    public void push(int val) {
        list.addLast(val);
        if (mList.isEmpty()) {
            mList.addLast(val);
        } else {
            mList.add(Math.min(mList.peekLast(), val));
        }
    }
    
    public void pop() {
        mList.pollLast();
        list.pollLast();
    }
    
    public int top() {
        return list.peekLast();
    }
    
    public int getMin() {
        return mList.peekLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */