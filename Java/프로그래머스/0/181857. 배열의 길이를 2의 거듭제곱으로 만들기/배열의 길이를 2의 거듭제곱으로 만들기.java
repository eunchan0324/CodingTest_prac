import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int n : arr) {
            list.add(n);
        }
        
        int[] x = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        
        int need = 0;
        for (int n : x) {
            if (arr.length <= n) {
                need = n - arr.length;
                break;
            }
        }
        
        for (int i=0; i<need; i++) {
            list.add(0);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}