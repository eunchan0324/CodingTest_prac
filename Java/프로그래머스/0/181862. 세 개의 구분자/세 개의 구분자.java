import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        
        if (sb.length() > 0) result.add(sb.toString());
        
        return result.isEmpty() ? new String[] {"EMPTY"} : result.toArray(new String[0]);
    }
}