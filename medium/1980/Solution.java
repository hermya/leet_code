import java.util.Arrays;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] conversion = new int[nums.length];
        int c = 0;
        for (String num : nums) {
            conversion[c] = convert(num);
            c++;
        }    

        Arrays.sort(conversion);
        
        var min = 0;

        for (int num : conversion) {
            if (min == num) {
                min++;
            }
        }

        return reversion(min, nums.length);
    }

    private int convert(String param){
        char[] arr = param.toCharArray();
        int start = arr.length - 1;
        int mul = 1;
        int ans = 0;
        while (start >= 0) {
            ans += mul * (arr[start] - '0');
            start--;
            mul *= 2;
        } 
        return ans;
    }

    private String reversion(int param, int n) {
        char[] ans = new char[n];
        int start = n - 1;

        while (param > 0 && start >= 0) {
            ans[start] = (char)(param % 2 + '0');
            start--;
            param /= 2;
        }

        while (start >= 0) {
            ans[start] = '0';
            start--;
        }

        return new String(ans);
    }
}