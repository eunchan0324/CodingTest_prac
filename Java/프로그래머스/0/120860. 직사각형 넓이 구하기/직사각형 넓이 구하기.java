class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int minWidth = Integer.MAX_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        
        for (int i=0; i<4; i++) {
            if (dots[i][0] < minWidth) minWidth = dots[i][0];
            if (dots[i][0] > maxWidth) maxWidth = dots[i][0];
            if (dots[i][1] < minHeight) minHeight = dots[i][1];
            if (dots[i][1] > maxHeight) maxHeight = dots[i][1];
        }
        
        System.out.println(minWidth);
        System.out.println(maxWidth);
        System.out.println(minHeight);
        System.out.println(maxHeight);
        
        return (maxWidth-minWidth) * (maxHeight-minHeight);
    }
}