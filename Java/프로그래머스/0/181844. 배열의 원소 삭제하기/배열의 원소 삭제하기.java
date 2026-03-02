import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            int tmp = arr[i];
            boolean contain = false;
            
            for (int j=0; j<delete_list.length; j++) {
                if (tmp == delete_list[j]) {
                    contain = true;
                    break;
                }
            }
            
            if (!contain) {
                list.add(tmp);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}