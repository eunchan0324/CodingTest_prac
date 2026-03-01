import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int one = 101;
        int two = 101;
        int thr = 101;
        
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                int tmp = rank[i];
                if (tmp < one) {
                    thr = two;
                    two = one;
                    one = tmp;
                } else if (tmp < two) {
                    thr = two;
                    two = tmp;
                } else if (tmp < thr) {
                    thr = tmp;
                }
                
                    
            }
        }
        
        int answer = 0;
        
        for (int i=0; i<rank.length; i++) {
            if (rank[i] == one) {
                answer += 10000 * i;
            } else if (rank[i] == two) {
                answer += 100 * i;
            } else if (rank[i] == thr) {
                answer += i;
            }
        }
        
        return answer;
    }
}