import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] lowers = new String[my_string.length()];
        
        for (int i=0; i<lowers.length; i++) {
            lowers[i] = String.valueOf(my_string.charAt(i)).toLowerCase();
        }
        
        Arrays.sort(lowers);
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : lowers) {
            sb.append(s);
        }
        
        
        return sb.toString();
    }
}