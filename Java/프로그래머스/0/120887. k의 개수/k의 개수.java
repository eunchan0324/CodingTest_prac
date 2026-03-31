class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num=i; num<=j; num++) {
            for (char c : String.valueOf(num).toCharArray()) {
                if (Integer.parseInt(String.valueOf(c)) == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}