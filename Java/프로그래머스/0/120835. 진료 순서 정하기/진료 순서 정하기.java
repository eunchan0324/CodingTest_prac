import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] list = new int[emergency.length];
        
        for (int i=0; i<list.length; i++) {
            list[i] = emergency[i];
        }
        
        Arrays.sort(list);
        
        for (int i=0; i<list.length/2; i++) {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
        
        for (int i=0; i<emergency.length; i++) {
            for (int j=0; j<list.length; j++) {
                if (emergency[i] == list[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}