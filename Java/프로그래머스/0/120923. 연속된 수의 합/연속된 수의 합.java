class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = total/num;
        }
        
        int center = (answer.length - 1) / 2;
        for (int i=0; i<answer.length; i++) {
            answer[i] += (i - center);
        }
        
        return answer;
    }
}