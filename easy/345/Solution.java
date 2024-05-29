import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        var vowList = new ArrayList<Character>();
        var posList = new ArrayList<Integer>();
        var arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (isAVowel(arr[i])) {
                vowList.add(arr[i]);
                posList.add(0, i);
            }
        }

        for (int i = 0; i < posList.size(); i++) {
            arr[posList.get(i)] = vowList.get(i);
        }
        return String.valueOf(arr);
    }

    boolean isAVowel(char x) {
        switch (x) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default: return false;
        }
    }
}