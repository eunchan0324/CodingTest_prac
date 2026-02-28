import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        
        for (String s : strArr) {
            count[s.length()]++;
        }
        
        int max = 0;
        for (int num : count) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
}