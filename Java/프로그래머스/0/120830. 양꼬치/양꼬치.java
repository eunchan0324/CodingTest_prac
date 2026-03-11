class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 양꼬치 
        answer += n * 12000;
        // 음료
        answer += k * 2000;
        // 서비스
        answer -= (n/10) * 2000;
        
        return answer;
    }
}