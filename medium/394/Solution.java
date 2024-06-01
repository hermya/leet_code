import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public String decodeString(String s) {
        var stack = new MyStack(100000);
        for (int i = 0; i < s.length(); i++) {
            var a = s.charAt(i);
            if (isBrack(a)) {
                if (a == '[') {
                    stack.push(a);
                } else {
                    // obtain string
                    // open bracket
                    // obtain number
                    // if not number anymore, return
                    var string = new LinkedList<Character>();
                    string.addFirst(stack.poll());
                    while (isChar(stack.peek())) {
                        string.addFirst(stack.poll());
                    }
                    stack.poll();
                    var num = 0;
                    var radix = 1;
                    while (stack.top > -1 && isNum(stack.peek())) {
                        num = num + (int)(stack.poll() - '0') * radix;
                        radix *= 10;
                    }
                    for (int j = 0; j < num; j++) {
                        for (Character x : string) {
                            stack.push(x);
                        }
                    }
                }
            } else {
                stack.push(a);
            }
        }
        return stack.toString();
    }

    boolean isBrack(char a) {
        return a == '[' || a == ']';
    }

    boolean isChar(char a) {
        var val = a - 'a';
        return val > - 1 && val < 26;
    }

    boolean isNum(char a) {
        var val = a - '0';
        return val > - 1 && val < 10;
    }
}

class MyStack {
    char[] stack;
    int top = -1;
    MyStack(int size) {
        stack = new char[size];
    }

    void push (char x) {
        top++;
        stack[top] = x; 
    }

    char poll() {
        top--;
        return stack[top + 1];
    }

    char peek() {
        return stack[top];
    }

    public String toString() {
        return String.valueOf(Arrays.copyOf(stack, top + 1));
    }
}