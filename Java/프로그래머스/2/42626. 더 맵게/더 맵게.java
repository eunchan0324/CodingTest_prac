import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
    
        Queue<Long> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.offer((long)s);
        } 
            
        while (pq.peek() < K) {
            if (pq.size() < 2) return -1;
            
            Long first = pq.poll();
            Long second = pq.poll();
            pq.offer(first + (second * 2));
            
            answer++;
        }
        
        return answer;
    }
}