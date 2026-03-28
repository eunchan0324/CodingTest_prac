class Solution {
    public int solution(int a, int b) {
        
        int denom = b / gcd(a, b);
        
        while (denom % 2 == 0) {
            denom /= 2;
        }
        
        while (denom % 5 == 0) {
            denom /= 5;
        }
        
        return denom == 1 ? 1 : 2;
    }
    
    private int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}