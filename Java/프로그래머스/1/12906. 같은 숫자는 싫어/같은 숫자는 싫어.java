import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i=arr.length-1; i>=0; i--) {
            stack.push(arr[i]);
        }
        
        int cnt= stack.pop();
        for (int i=0; i<arr.length-1; i++) {
            if (cnt == stack.peek()) {
                stack.pop();
            } else {
                list.add(cnt);
                cnt = stack.pop();
            }
            if (stack.isEmpty()) {
                list.add(cnt);
            } 
        }

        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}