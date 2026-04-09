import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        for (int i=0; i<bridge_length; i++) {
            bridge.offer(0);
        }
        
        int cntWeight = 0;
        int time = 0;
        int idx = 0;
        
        while(idx < truck_weights.length) {
            time++;
            
            cntWeight -= bridge.poll();
            
            if (cntWeight+truck_weights[idx] <= weight) {
                cntWeight += truck_weights[idx];
                bridge.offer(truck_weights[idx++]);
            } else {
                bridge.offer(0);
            }
        }
        
        return time + bridge_length;
    }
}