class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        String[] words = letter.trim().split(" ");
        
        for (String w : words) {
            for (int i=0; i<mos.length; i++) {
                if (w.equals(mos[i])) {
                    sb.append((char) (i+'a'));
                }
            }
        }
        
        return sb.toString();
    }
}