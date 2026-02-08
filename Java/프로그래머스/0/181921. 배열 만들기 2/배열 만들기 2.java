import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            String num = String.valueOf(i);
            
            int cnt = 0;
            
            for (int j=0; j<num.length(); j++) {
                char c = num.charAt(j);
                
                if (c == '5' || c == '0') {
                    cnt += 1;
                }
            }
            
            if (cnt == num.length()) {
                    list.add(Integer.parseInt(num));
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        System.out.println(list.size());
        
        int[] no = {-1};
        
        if (list.size() == 0) {
            return no;
        } else {
            return answer;
        }
    }
}