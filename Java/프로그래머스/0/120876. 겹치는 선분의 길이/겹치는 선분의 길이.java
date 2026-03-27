import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        
        int[] a = new int[lines[0][1] - lines[0][0]];
        int[] b = new int[lines[1][1] - lines[1][0]];
        int[] c = new int[lines[2][1] - lines[2][0]];
        
        int aIndex = 0;
        for (int i=lines[0][0]; i<lines[0][1]; i++) {
            a[aIndex++] = i;
        }
        
        int bIndex = 0;
        for (int i=lines[1][0]; i<lines[1][1]; i++) {
            b[bIndex++] = i;
        }
        
        int cIndex = 0;
        for (int i=lines[2][0]; i<lines[2][1]; i++) {
            c[cIndex++] = i;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                }
            }
            for (int k=0; k<c.length; k++) {
                if (a[i] == c[k]) {
                    set.add(a[i]);
                }
            }
        }
        
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<c.length; j++) {
                if (b[i] == c[j]) {
                    set.add(b[i]);
                }
            }
        }
        
        int answer = set.size();
        
        
        return answer;
    }
}