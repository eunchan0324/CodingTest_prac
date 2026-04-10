import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack();
        int[] answer = new int[prices.length];
        
        for (int i=0; i<prices.length; i++) {
            
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int popped = stack.pop();
                answer[popped] = i - popped;
            }
            
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int popped = stack.pop();
            answer[popped] = (prices.length -1) - popped; 
        }
        
        return answer;
    }
}