class Solution {
    public int solution(int balls, int share) {
        int m = Math.min(balls, share);
        
        long answer = 1;
        
        for (int i=0; i<m; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        return (int) answer;
    }
}