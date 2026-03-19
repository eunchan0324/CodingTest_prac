import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] answer = new int[array.length];
        
        for (int i=0; i<array.length; i++) {
            answer[i] = array[i]-n;
        }
        
        int min = 100;
        for (int num : answer) {
            if (num < Math.abs(min)) {
                min = num;
            }
        }
        
        for (int i=0; i<answer.length; i++) {
            if (min+n == array[i]) {
                return array[i];
            }
        }
            
        return min+n;
    }
}