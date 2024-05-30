import java.util.Arrays;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        var ans = new int[asteroids.length];
        var top = -1;
        for (int i = 0; i < asteroids.length; i++) {
            if (top == -1) {
                top++;
                ans[top] = asteroids[i];
            } else {
                var l = ans[top];
                var r = asteroids[i];
                if (neg(l*r)) {
                    if (neg(l) && !neg(r)) {
                        top++;
                        ans[top] = asteroids[i];
                    } else {
                        var collision = l + r;
                        if (collision == 0) {
                            top --;
                        } else if (collision < 0) {
                            top++;
                            ans[top] = r;
                            while (neg(l*r) && collision < 0 && top > 0) {
                                ans[top] = r;
                                l = ans[top - 1];
                                collision = r + l;
                                top--;
                            }
                            if (!neg(l*r)) {
                                top++;
                            }
                            if (collision < 0) {
                                ans[top] = r;
                            }
                            if (collision == 0) {
                                top--;
                            }
                        }
                    }
                } else {
                    top++;
                    ans[top] = asteroids[i];
                }
            }
        }
        return Arrays.copyOf(ans, top + 1);
    }

    boolean neg(int num) {
        return num / Math.abs(num) == -1;
    }
}