import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            int size = list.size();
            
            if (list.size() < 1) {
                list.add(arr[i]);
            } else if (arr[i] == list.get(size-1)) {
                list.remove(list.size()-1);
            } else if (arr[i] != list.get(size-1)) {
                list.add(arr[i]);
            }
        }
        
        if (list.isEmpty()) {
            return new int[] {-1};
        }
    
        return list.stream().mapToInt(i->i).toArray();
    }
}