class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board.length;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 1) {
                    for (int d=0; d<8; d++) {
                        int nr = i + dr[d];
                        int nc = j + dc[d];
                        
                        if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                            if (board[nr][nc] == 0) {
                                board[nr][nc] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}