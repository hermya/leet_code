
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        var len = temperatures.length;
        var stack = new ValHol[len];
        var top = 0;
        stack[top] = new ValHol( temperatures[len - 1], len - 1);
        var answer = new int[len];
        for (int i = len - 2; i >= 0 ; i--) {
            while ( top >= 0 && stack[top].val <= temperatures[i] ) {
                top--;
            }
            if (top == -1) {
                answer[i] = 0;
            } else {
                answer[i] = stack[top].ind -i;
            }
            top++;
            stack[top] =  new ValHol( temperatures[i], i);
        }
        return answer;
    }
}
class ValHol{
    int val;
    int ind;
    ValHol(int x, int y) {
        this.val = x;
        this.ind = y;
    }
}