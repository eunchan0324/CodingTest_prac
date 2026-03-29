import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int[] s : score) {
            list.add(s[0] + s[1]);
        }
        
        list.sort(Collections.reverseOrder());
        
        int[] answer = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            int myScore = score[i][0] + score[i][1];
            
            answer[i] = list.indexOf(myScore)+1;
        }
        
        return answer;
    }
}