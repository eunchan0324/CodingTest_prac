import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        Map<Character, String> list = Map.of(
            '2', "0",
            '0', "5",
            '5', "2"
        );
        
        for (char c : rsp.toCharArray()) {
            sb.append(list.get(c));
        } 
        
        return sb.toString();
    }
}