import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        
        int[] sortedP = priorities.clone();
        Arrays.sort(sortedP);
        
        int maxIdx = sortedP.length-1;
        
        for (int i=0; i<priorities.length; i++) {
            q.offer(new int[] {priorities[i], i});
        }
        
        int excuteCount = 0;
        
        while (!q.isEmpty()) {
            int[] cnt = q.poll();
            
            if (cnt[0] < sortedP[maxIdx]) {
                q.offer(cnt);
            } else {
                excuteCount++;
                maxIdx--;
                
                if (cnt[1] == location) {
                    return excuteCount;
                }
            }
        }
        
        return 0;
    }
}