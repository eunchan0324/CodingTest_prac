class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = 0;
        
        for (int i=1; i<=10; i++) {
            int cnt = factorial(i);
            if (cnt > max && cnt <= n) {
                max = cnt;
                answer = i;
            }
        }
        
        return answer;
    }
    
    private int factorial (int num) {
        int fac = 1;
        
        for (int i=1; i<=num; i++) {
            fac *= i;
        }
        
        return fac;
    }
}