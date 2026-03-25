import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Set<String> spellSet = new HashSet<>(Arrays.asList(spell));
        
        for (String word : dic) {
            Set<String> wordSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordSet.add(String.valueOf(c));
            }
            if (spellSet.equals(wordSet)) return 1;
        }
        
        return 2;
    }
}