import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Set<String> set = new HashSet<>();
        for (String s : spell) {
            set.add(s);
        }
        
        for (String s : dic) {
            for (char c : s.toCharArray()) {
                if (set.contains(String.valueOf(c))) {
                    set.remove(String.valueOf(c));
                }
            }
            if (set.size() == 0) {
                return 1;
            } else if (set.size() > 0) {
                for (String str : spell) {
                    set.add(str);
                }
            }
        }
        
        return 2;
    }
}