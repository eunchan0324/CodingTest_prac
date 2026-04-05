import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(days);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int maxDay = q.poll();
            int count = 1;
            
            while (!q.isEmpty() && q.peek() <= maxDay) {
                q.poll();
                count++;
            }
            
            answerList.add(count);
        }
        
        return answerList.stream().mapToInt(i->i).toArray();
    }
}