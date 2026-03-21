class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        
        return sum;
    }
}