import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = n;
        list.add(num);
        
        while(true) {
            if (num == 1) {
                break;
            }
                        
            if (num % 2 == 0) {
                num = num/2;
            } else {
                num = 3*num+1;
            }
            
            list.add(num);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}