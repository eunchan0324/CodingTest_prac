import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        
        for (char c : my_string.toCharArray()) {
            set.add(String.valueOf(c));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : set) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}