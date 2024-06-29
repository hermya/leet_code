class Solution {
    public int evalRPN(String[] tokens) {
        var opStack = new int[tokens.length];
        var top = -1;

        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                var y = opStack[top];
                var x = opStack[top - 1];
                opStack[top - 1] = perform(tokens[i], x, y);
                top--;
            } else {
                top++;
                opStack[top] = Integer.parseInt(tokens[i]);
            }
        }
        return opStack[0];
    }
    
    boolean isOperator(String op) {
        return op.length() == 1 && (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*"));
    }

    int perform (String operator, int x, int y) {
        switch (operator)  {
            case "+" : return x + y;
            case "-" : return x - y;
            case "*" : return x * y;
            case "/" : return x / y;
            default: return 0;
        }
    }

}