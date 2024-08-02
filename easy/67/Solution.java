class Solution {
    public String addBinary(String a, String b) {
        var ab = a.toCharArray();
        var bb = b.toCharArray();
        var builder = new StringBuilder();

        int i = ab.length - 1;
        int j = bb.length - 1;
        int c = 0;
        while (i >= 0 && j >= 0) {
            var s = ab[i] - '0' + bb[j] - '0' + c;
            switch (s) {
                case 0: builder.insert(0, "0"); c = 0; break;
                case 1: builder.insert(0, "1"); c = 0; break;
                case 2: builder.insert(0, "0"); c = 1; break;
                case 3: builder.insert(0, "1"); c = 1; break;
                default: break;
            }
            i--;
            j--;
        }

        while (i >= 0) {
            var s = ab[i] - '0' + c;
            switch (s) {
                case 0: builder.insert(0, "0"); c = 0; break;
                case 1: builder.insert(0, "1"); c = 0; break;
                case 2: builder.insert(0, "0"); c = 1; break;
                case 3: builder.insert(0, "1"); c = 1; break;
                default: break;
            }
            i--;
        }

        while (j >= 0) {
            var s = bb[j] - '0' + c;
            switch (s) {
                case 0: builder.insert(0, "0"); c = 0; break;
                case 1: builder.insert(0, "1"); c = 0; break;
                case 2: builder.insert(0, "0"); c = 1; break;
                case 3: builder.insert(0, "1"); c = 1; break;
                default: break;
            }
            j--;
        }
        if (c == 1) {
            builder.insert(0, "1");
        }
        return builder.toString();
    }
}