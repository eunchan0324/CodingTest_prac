class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0, y = 0;
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for (String key : keyinput) {
            if (key.equals("left")) {
                int nextX = x - 1;
                if (Math.abs(nextX) <= Math.abs(xLimit)) {
                    x = nextX;
                } 
            } else if (key.equals("right")) {
                int nextX = x + 1;
                if (Math.abs(nextX) <= Math.abs(xLimit)) {
                    x = nextX;
                }
            } else if (key.equals("up")) {
                int nextY = y + 1;
                if (Math.abs(nextY) <= Math.abs(yLimit)) {
                    y = nextY;
                }
            } else if (key.equals("down")) {
                int nextY = y - 1;
                if (Math.abs(nextY) <= Math.abs(yLimit)) {
                    y = nextY;
                }
            }
        }
        
        int[] answer = {x, y};
        
        return answer;
    }
}