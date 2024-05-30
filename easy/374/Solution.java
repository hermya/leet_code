/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        long num = n/2;
        long u = (long)n + 1;
        long l = 0;
        var res = false;
        while (!res) {
            var g = guess((int)num);
            if (g > 0) {
                l = num;
                num = (u + l)/2;
            } else if (g < 0) {
                u = num;
                num = (u + l)/2;
            } else {
                res = true;
            }
            //System.out.println(num);
        }
        return (int)num;
    }
}