import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int[] answer = new int[array.length];
        
        for (int i=0; i<array.length; i++) {
            answer[i] = Math.abs(array[i]-n);
        }
        
        int min = answer[0];
        
        for (int num : answer) {
            if (num < min) {
                min = num;
            }
        }
        
        for (int i=0; i<answer.length; i++) {
            if (min == answer[i]) {
                return array[i];
            }
        }
        
        return 0;
    }
}