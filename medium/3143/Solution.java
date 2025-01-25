
class Solution {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] tagCount = new int[27];
        int[][] holder = new int[27][2];
        int[][] holder2 = new int[27][2];
        for (int[] holds: holder) {
            holds[0] = 1000000001;
            holds[1] = 1000000001;
        }
        
        for (int[] holds: holder2) {
            holds[0] = 1000000001;
            holds[1] = 1000000001;
        }

        var numOfPoints = 0; 
        for (int i = 0; i < s.length(); i++) {
            tagCount[s.charAt(i) - 'a']++;
            var temp = pointCloserToZero(holder[s.charAt(i) - 'a'], points[i]); 
            if (temp[0] != holder[s.charAt(i) - 'a'][0] || temp[1] != holder[s.charAt(i) - 'a'][1]) {
                holder2[s.charAt(i) - 'a'] = holder[s.charAt(i) - 'a'];
                holder[s.charAt(i) - 'a'] = temp;
            } else {
                temp = pointCloserToZero(holder2[s.charAt(i) - 'a'], points[i]); 
                if (temp[0] != holder2[s.charAt(i) - 'a'][0] || temp[1] != holder2[s.charAt(i) - 'a'][1]) {
                    holder2[s.charAt(i) - 'a'] = temp;
                } 
            }
        }

        int[] minPoint1 = new int[]{1000000001, 1000000001};
        for (int i = 0; i < tagCount.length; i++) {
            if (tagCount[i] > 1) {
                minPoint1 = pointCloserToZero(minPoint1, holder2[i]);
            }
        }

        for (int i = 0; i < tagCount.length; i++) {
            var tempPoint = pointCloserToZero(minPoint1, holder[i]);
            if (tempPoint[0] == minPoint1[0] && tempPoint[1] == minPoint1[1]) {
                continue;
            } else {
                numOfPoints++;
            }
        }
        return numOfPoints;
    }

    int[] pointCloserToZero(int[] point1, int[] point2){
        var p1Max = Math.max(Math.abs(point1[0]), Math.abs(point1[1]));
        var p2Max = Math.max(Math.abs(point2[0]), Math.abs(point2[1]));
        return p1Max > p2Max ? point2 : point1;
    }

    
    int[] pointFartherFromZero(int[] point1, int[] point2){
        var p1Max = Math.max(Math.abs(point1[0]), Math.abs(point1[1]));
        var p2Max = Math.max(Math.abs(point2[0]), Math.abs(point2[1]));
        return p1Max < p2Max ? point2 : point1;
    }
}
