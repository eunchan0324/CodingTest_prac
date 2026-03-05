class Solution {
    public int[][] solution(int[][] arr) {
        
        int r = arr.length;
        int c = arr[0].length;
        
        if (r == c) {
            return arr;
        }
        
        int[][] answer = r > c ? new int[r][r] : new int[c][c];
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}