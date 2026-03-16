class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (isY(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isY(int num) {
        int count = 0;
        
        for (int i=1; i<=num; i++) {
            if (num%i == 0) {
                count++;
            }
        }
        
        return (count >= 3) ? true : false;
    }
}