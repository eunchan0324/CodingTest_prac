class Solution {
    public int solution(int[] numbers, int k) {
        int cnt = 0;
        
        for (int i=0; i<k-1; i++) {
            cnt = (cnt+2) % numbers.length;
        }
        
        return numbers[cnt];
    }
}