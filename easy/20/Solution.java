class Solution {
    public boolean isValid(String s) {
        var sarr = s.toCharArray();
        var stack = new char[s.length()];
        var top = -1;
        for (int i = 0; i < sarr.length; i++) {
            if (isClosingBracket(sarr[i]) && top == -1) {
                //System.out.println(Arrays.toString(stack) + " " + sarr[i]);
                return false;
            } else if (isOpeningBracket(sarr[i])) {
                top++;
                stack[top] = sarr[i];
            } else if (isClosingBracket(sarr[i])) {
                if (isMatchingBracket(stack[top], sarr[i])) {
                    top--;
                } else {
                    //System.out.println(Arrays.toString(stack) + " " + sarr[i]);
                    return false;
                }
            }
        }
        return top == -1;
    }

    boolean isClosingBracket(char b) {
        switch (b) {
            case '}':
            case ')':
            case ']':
                return true;
            default:
                return false;
        }
    }

    boolean isOpeningBracket(char b) {
        switch (b) {
            case '{':
            case '(':
            case '[':
                return true;
            default:
                return false;
        }
    }

    boolean isMatchingBracket(char b1, char b2) {
        if (b1 == '{' && b2 == '}') {
            return true;
        }
        if (b1 == '(' && b2 == ')') {
            return true;
        }
        if (b1 == '[' && b2 == ']') {
            return true;
        }
        return false;
    }
}