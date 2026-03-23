import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=my_str.length(); i++) {
            sb.append(my_str.charAt(i-1));
            if (i % n == 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
            if (i == my_str.length() && sb.length() > 0) {
                list.add(sb.toString());
            }
        }
        
        String[] answer = new String[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}