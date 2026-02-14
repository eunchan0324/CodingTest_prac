import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i=0; i<intStrs.length; i++) {
            String part = intStrs[i].substring(s, s + l);
            int value = Integer.parseInt(part);
            
            if (value > k) {
                nums.add(value);
            }
        }
        
        int[] answer = new int[nums.size()];
        
        for (int i=0; i<nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}