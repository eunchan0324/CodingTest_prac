class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=n; i>=1; i-=2) {
            if (i % 2 == 0) {
                answer += i*i;
            } else {
                answer += i;
            }   
        }
        
        return answer;
    }
}