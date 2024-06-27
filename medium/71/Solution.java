import java.util.LinkedList;

class Solution {
    public String simplifyPath(String path) {
        var ss = path.split("/");
        //System.out.println(Arrays.toString(ss));
        var stack = new LinkedList<String>();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals("..")) {
                if (stack.size() > 0) {
                    stack.pollLast();
                }
            } else if (!ss[i].equals(".") && !ss[i].equals("/") && ss[i].length() > 0) {
                stack.addLast(ss[i]);
            }
        }
        return "/" + String.join("/", stack);
    }
}