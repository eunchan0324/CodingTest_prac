import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=l; i<=r; i++) {
            if (check(i)) {
                list.add(i);
            }
        }
            
        if (list.size() == 0) {
            return new int[] {-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    
    private boolean check(int num) {
        String numStr = String.valueOf(num);
        
        for (char c : numStr.toCharArray()) {
            if (c != '5' && c != '0') {
                return false;
            }
        }
        
        return true;
    }
}