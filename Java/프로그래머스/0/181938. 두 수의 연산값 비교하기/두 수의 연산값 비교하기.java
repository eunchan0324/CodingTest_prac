class Solution {
    public int solution(int a, int b) {
        
        String r1 = "" + a + b;
        
        int num1 = Integer.parseInt(r1);
        int num2 = 2 * a * b;
        
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
}