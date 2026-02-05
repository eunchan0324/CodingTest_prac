class Solution {
    public int solution(int n) {
        int odd = 0;
        int even = 0;
        
        // n이 홀수인지 짝수인지 확인
        // 홀수라면 n이하의 홀수인 모든 양의 정수의 합을 더하고
        // 짝수라면 n이하의 짝수인 모든 양의 정수의 제곱을 return
        for (int i=1; i<=n; i++) {
            if (i % 2 == 0) {
                even += i*i;
            } else {
                odd += i;
            }   
        }
        
        if (n % 2 == 0) {
            return even;
        } else {
            return odd;
        } 
    }
}