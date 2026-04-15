import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int n=0; n<commands.length; n++) {
            int from = commands[n][0]-1;
            int to = commands[n][1];
            int k = commands[n][2]-1;
            
            int[] slice = Arrays.copyOfRange(array, from, to);
            Arrays.sort(slice);
            
            answer[n] = slice[k];
        }        
        
        return answer;
    }
}