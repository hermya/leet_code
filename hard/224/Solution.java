class Solution {
    public int calculate(String s) {
        var sarr = s.toCharArray();
        var carr = new String[3*s.length()];
        var cSize = 0;
        var wasOperand = false;
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i] == ' ') {
                continue;
            }
            if (wasOperand && isOperand(String.valueOf(sarr[i]))) {
                carr[cSize - 1] = carr[cSize - 1] + sarr[i];
            } else {
                carr[cSize] = String.valueOf(sarr[i]);
                cSize++;
                wasOperand = isOperand(String.valueOf(sarr[i]));
            }   
        }

        //System.out.println(Arrays.toString(Arrays.copyOf(carr, cSize)));
        var operandStack = new Operand[sarr.length];
        var operatorStack = new char[sarr.length];
        var operandTop = -1;
        var operatorTop = -1;
        for (int i = 0; i < cSize; i++) {
            if (isOperand(carr[i])) {
                if (operandTop == -1 || operandStack[operandTop].isBrack) {
                    operandTop++;
                    operandStack[operandTop] = new Operand(Integer.parseInt(carr[i]), '0', false);
                } else {
                    var x = Integer.parseInt(carr[i]);
                    var y = operandStack[operandTop].val;
                    operandStack[operandTop].val = perform(y, x, operatorStack[operatorTop]);
                    operatorTop--;
                }
            }
            if (isOperator(carr[i])) {
                if (operandTop == -1 || !isOperand(String.valueOf(operandStack[operandTop]))) {
                    operandTop++;
                    operandStack[operandTop] = new Operand(-1, '0', false);
                    operatorTop++;
                    operatorStack[operatorTop] = '*';
                } else {
                    operatorTop++;
                    operatorStack[operatorTop] = carr[i].toCharArray()[0];
                }
            }
            if (isABracket(carr[i])) {
                if (carr[i].toCharArray()[0] == '(') {
                    operandTop++;
                    operandStack[operandTop] = new Operand(0, '(', true);
                } else {
                    if (operandStack[operandTop - 1].isBrack) {
                        operandTop--;
                        operandStack[operandTop] = operandStack[operandTop + 1];
                    } else {
                        var x = operandStack[operandTop].val;
                        operandStack[operandTop - 1].val = x;
                        operandStack[operandTop - 1].isBrack = false;
                        operandTop--;
                    }
                    if (operandTop > 0) {
                        var x = operandStack[operandTop].val;
                        var y = operandStack[operandTop - 1].val;
                        operandStack[operandTop - 1].val = perform(y, x, operatorStack[operatorTop]);
                        operatorTop--;
                        operandTop--;
                    }
                }
            }
            //System.out.println(Arrays.toString(Arrays.copyOf(operandStack, operandTop + 1)));
            //System.out.println(Arrays.toString(Arrays.copyOf(operatorStack, operatorTop + 1)));
        }
        if (operandTop == 1) {
            return perform(operandStack[operandTop - 1].val, operandStack[operandTop].val, operatorStack[0]);
        }
        return operandStack[0].val;
    }

    boolean isOperand(String a){
        return a.length() > 1 || !(isOperator(a) || isABracket(a));
    }

    boolean isOperator(String op) {
        var a = op.toCharArray()[0];
        return a == '+' || a == '-' || a == '*' ;
    }
    
    boolean isABracket(String b) {
        var a = b.toCharArray()[0];
        if (a == '(' || a == ')') {
            return true;
        }
        return false;
    }

    int perform(int a, int b, char x) {
        switch(x) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            default: return 0;
        }
    }
}

class Operand {
    int val;
    char brack;
    boolean isBrack;
    Operand (int a, char b, boolean c) {
        val = a;
        brack = b;
        isBrack = c;
    }

    public String toString() {
        if (isBrack) {
            return String.valueOf(brack);
        } else {
            return String.valueOf(val);
        }
    }
}