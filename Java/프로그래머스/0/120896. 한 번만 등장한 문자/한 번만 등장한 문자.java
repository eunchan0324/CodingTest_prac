class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int[] alpabets = new int[26];
        
        for (char c : s.toCharArray()) {
            alpabets[c - 'a']++;
        }
        
        for (int i=0; i<alpabets.length; i++) {
            if (alpabets[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        } 
        
        return sb.toString();
    }
}