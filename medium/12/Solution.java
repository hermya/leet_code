class Solution {
    public String intToRoman(int num) {
        var ans = new StringBuilder();
        var a = num % 10;

        if (a < 4) {
            ans.append("I".repeat(a));
        } else if (a > 4 && a < 9) {
            ans.append("V");
            ans.append("I".repeat(a - 5));
        } else if (a == 4) {
            ans.append("IV");
        } else if (a == 9) {
            ans.append("IX");
        }

        num = num/10;
        a = num%10;

        if (a < 4) {
            ans.insert(0, "X".repeat(a));
        } else if (a > 4 && a < 9) {
            ans.insert(0, "X".repeat(a - 5));
            ans.insert(0, "L");
        } else if (a == 4) {
            ans.insert(0, "XL");
        } else if (a == 9) {
            ans.insert(0, "XC");
        }
        
        num = num/10;
        a = num%10;

        if (a < 4) {
            ans.insert(0, "C".repeat(a));
        } else if (a > 4 && a < 9) {
            ans.insert(0, "C".repeat(a - 5));
            ans.insert(0, "D");
        } else if (a == 4) {
            ans.insert(0, "CD");
        } else if (a == 9) {
            ans.insert(0, "CM");
        }

        num = num/10;
        a = num%10;

        ans.insert(0, "M".repeat(a));
        return ans.toString();
    }

}