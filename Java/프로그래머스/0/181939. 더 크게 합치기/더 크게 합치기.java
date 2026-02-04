class Solution {
    public int solution(int a, int b) {
        
        String r1 = String.valueOf(a) + String.valueOf(b);
        String r2 = String.valueOf(b) + String.valueOf(a);
    
        int num1 = Integer.parseInt(r1);
        int num2 = Integer.parseInt(r2);
        
        return Math.max(num1, num2);
    }
}