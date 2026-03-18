import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        String[] strArr = s.split(" ");
        
        for (String str : strArr) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        
        for (int num : stack) {
            answer += num;
        }
        
        return answer;
    }
}